import os
import numpy as np
import argparse
import time
from sklearn.cluster import DBSCAN
from posixpath import split
from gensim.models import FastText

#向量规范化
def normalize(vec):
    res = []
    vec_len = np.linalg.norm(vec)
    for dimention in vec:
        norm_dimention = dimention / vec_len
        res.append(norm_dimention)
    return res

def minus(vec1,vec2):
    res = []
    vec1_len = len(vec1)
    vec2_len = len(vec2)
    print("vec1_len:",vec1_len)
    print("vec2_len:",vec2_len)
    for i in range(0,vec1_len):
        dimention = vec1[i] - vec2[i]
        res.append(dimention)
    return res

parser = argparse.ArgumentParser(description='get the each api counts from a txt. if an api occurs many times in one function, just count 1')

parser.add_argument('rareFuncFile', metavar='known', type=str, 
                    help='The file containing rare function)')
parser.add_argument('freqFuncDepFile', metavar='known', type=str, 
                    help='The file containing function dependence)')
parser.add_argument('fastTextFile', metavar='known', type=str, 
                    help='The file containing fastText model)')
parser.add_argument('seed', metavar='seed', type=str, 
                    help='The file containing seed APIs)')

args = parser.parse_args()
fRareFunc = args.rareFuncFile
freqFuncDepFile = args.freqFuncDepFile
fastTextFile = args.fastTextFile
fseed = args.seed

api_contexts_vec = {}
api_contexts_centroid = {}
api_sims = {}
subword_freq = {}
functionSubword = {}
function2vec = {}
functionvecList = []
functionNameList = []
api_depfuncfreq = {}
dep_freq = {}
func_keyvec = {}
keyvecList = []

print(time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()))

print("loading model: {}".format(os.path.abspath(fastTextFile)))
model = FastText.load(fastTextFile)

print("loading rare function file: {}".format(os.path.abspath(fRareFunc)))
frare = open(fRareFunc, "r")
rare_funcs = frare.read().split('\n')
frare.close()

print("loading seed Func: {}".format(os.path.abspath(fseed)))
fseed = open(fseed, "r")
seed_func = fseed.read().split('\n')
fseed.close()

print("loading freqFuncDepFile: {}".format(os.path.abspath(freqFuncDepFile)))
fdepfreq = open(freqFuncDepFile, "r")
lines = fdepfreq.readlines()
i = 1
for line in lines:
    if i % 3 == 1:
        read_line = line.split(' ')
        #print(read_line)
        funcname = read_line[0]
        depcnt = int(read_line[1].strip('\n'))
        dep_freq = {}
    elif i % 3 == 2:
        read_line = line.split(' ')
        for j in range(depcnt):
            dep_func = read_line[2*j]
            freq = read_line[2*j+1]
            dep_freq[dep_func] = int(freq)
    elif i % 3 == 0:
        api_depfuncfreq[funcname] = dep_freq
    #判断最后一行
    if line is lines[-1]:
        api_depfuncfreq[funcname] = dep_freq
    i += 1	
fdepfreq.close()

# 上下文加频率
for function in api_depfuncfreq.keys():
    contextVec = []
    for dep in api_depfuncfreq[function].keys():
        dep_vec = model.wv[dep]
        for i in range(api_depfuncfreq[function][dep]):
            contextVec.append(dep_vec)
    if contextVec:
        api_contexts_vec[function] = contextVec
        
# 对每个api的上下文向量进行dbSCAN聚类，并求质心作为其上下文向量
print('starting context dbScan...')
for api,contexts_vec in api_contexts_vec.items():
    #api = item.key()
    #contexts_vec = item.value()
    #print(api)
    #print(contexts_vec)
    db = DBSCAN(eps=0.8, min_samples=10).fit(contexts_vec)
    #print(db)
    labels = db.labels_
    #print(labels)
    num_clusters = len(set(labels)) - (1 if -1 in labels else 0)
    #print(num_clusters)
    #上下文无法形成聚类，将上下文向量的质心作为其上下文
    if num_clusters == 0:
        centroid_of_context = np.mean(contexts_vec, axis=0)
        api_contexts_centroid[api] = [centroid_of_context]
    #上下文形成聚类，将每个聚类向量的质心作为其一个上下文
    else:
        for count in range(num_clusters):
            cluster_vec = []
            #print('Cluster', count, ':')
            for num,label in enumerate(labels):
                if label == count:
                    cluster_vec.append(contexts_vec[num])        
                    #print(contexts_vec[num])
            centroid_of_cluster = np.mean(cluster_vec, axis=0)
            #print('centroid_of_cluster:',centroid_of_cluster)
            if api in api_contexts_centroid.keys():
                api_contexts_centroid[api].append(centroid_of_cluster)
            else:
                api_contexts_centroid[api] = [centroid_of_cluster]  
    #print(api,api_contexts_centroid[api])


#对每一个函数的嵌入-上下文向量与种子函数的嵌入-上下文向量进行类比推理，取最高相似度作为函数与种子的相似度
for seed_api in seed_func:
    if model.wv.has_index_for(seed_api):
        seed_wv = model.wv[seed_api]
        if seed_api in api_contexts_centroid.keys():
            seed_contexts_centroid = api_contexts_centroid[seed_api]
            for api,contexts_centroid in api_contexts_centroid.items():
                if api not in rare_funcs:
                    continue
                api_wv = model.wv[api]
                sim = []
                for api_context_centroid in contexts_centroid:
                    for seed_context_centroid in seed_contexts_centroid:
                        api_offset = api_wv - api_context_centroid
                        seed_offset = seed_wv - seed_context_centroid
                        #计算余弦相似度
                        similarity = np.dot(api_offset, seed_offset)/(np.linalg.norm(api_offset) * np.linalg.norm(seed_offset))
                        sim.append(similarity)
                #将相似度从高到低进行排序，取最高相似度
                sorted_sim = sorted(sim, reverse=True)
                if api not in api_sims.keys():
                    api_sims[api] = sorted_sim[0]
                elif sorted_sim[0] > api_sims[api]:
                    api_sims[api] = sorted_sim[0]
               
#将结果进行排序，从高到低进行输出
print('output api and similirity:')
fresult = open("result.txt","w")
sorted_api_sims = sorted(api_sims.items(), key = lambda kv:(kv[1], kv[0]), reverse=True)
rank = 1
for item in sorted_api_sims:
    # if item[0] not in rare_funcs:
    print(rank, ' ', item, file = fresult)
    rank = rank + 1
fresult.close()

print('end...')

print(time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()))