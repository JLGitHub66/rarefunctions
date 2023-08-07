import os
import numpy as np
import argparse
from sklearn.cluster import DBSCAN
from posixpath import split
from gensim.models import Word2Vec

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

parser.add_argument('subwordCountFile', metavar='known', type=str, 
                    help='The file containing subword count)')
parser.add_argument('funtionSubwordFile', metavar='known', type=str, 
                    help='The file containing function and its subword)')
parser.add_argument('subword2vecFile', metavar='known', type=str, 
                    help='The file containing subword embedding)')
parser.add_argument('rareFuncFile', metavar='known', type=str, 
                    help='The file containing rare function)')
parser.add_argument('freqFuncDepFile', metavar='known', type=str, 
                    help='The file containing function dependence)')
parser.add_argument('expendContextFile', metavar='known', type=str, 
                    help='The file containing function dependence)')

args = parser.parse_args()
subwordCountFile = args.subwordCountFile
funtionSubwordFile = args.funtionSubwordFile
subword2vecFile = args.subword2vecFile
fRareFunc = args.rareFuncFile
freqFuncDepFile = args.freqFuncDepFile
expendContextFile = args.expendContextFile

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

print("loading model: {}".format(os.path.abspath(subword2vecFile)))
model = Word2Vec.load(subword2vecFile)

print("loading rare function file: {}".format(os.path.abspath(fRareFunc)))
frare = open(fRareFunc, "r")
rare_funcs = frare.read().split('\n')
frare.close()

print("loading subwordCountFile: {}".format(os.path.abspath(subwordCountFile)))
fsubwordCount = open(subwordCountFile, "r")
for line in fsubwordCount.readlines():
    read_line = line.split(" ")
    subword = read_line[0]
    freq = read_line[1]
    subword_freq[subword] = int(freq.strip("\n"))

print("loading funtionSubwordFile: {}".format(os.path.abspath(funtionSubwordFile)))
ffuntionSubword = open(funtionSubwordFile, "r")
i = 1
for line in ffuntionSubword.readlines():
    if line != "\n":
        if i % 3 == 1:
            functionName = line.strip("\n")
        elif i % 3 == 2:
            subwordList = line.split(" ")
            newList = []
            for subword in subwordList:
                if subword != "\n":
                    newList.append(subword)
    else:
        functionSubword[functionName] = newList
    i += 1

print("start compute function vector.")
for functionName in functionSubword.keys():
    function_wv = []
    subword0 = functionSubword[functionName][0]
    subword0_wv = model.wv[subword0]
    freq = subword_freq[subword0]
    for dimention in subword0_wv:
        function_wv.append(dimention * freq)
    sum_freq = freq
    for i in range(1,len(functionSubword[functionName])):
        subword = functionSubword[functionName][i]
        subword_wv = model.wv[subword]
        freq = subword_freq[subword]
        sum_freq += freq
        for j in range(0,len(subword_wv)):
            function_wv[j] += subword_wv[j] * freq
    for i in range(0,len(function_wv)):
        function_wv[i] = function_wv[i] / sum_freq
    function_wv = normalize(function_wv)
    function2vec[functionName] = function_wv
    functionvecList.append(function_wv)
    function2vec[functionName] = function_wv

# for functionName in functionSubword.keys():
#     keywordList = []
#     for i in range(0,len(functionSubword[functionName])):
#         subword = functionSubword[functionName][i]
#         freq = subword_freq[subword]
#         if freq > 100000:
#             keywordList.append(subword)
#     functionNameList.append(functionName)
#     #function_wv = model.wv[functionSubword[functionName][0]]
#     if keywordList:
#         for keyword in keywordList:

#     function_wv = []
#     subword0 = functionSubword[functionName][0]
#     subword0_wv = model.wv[subword0]
#     freq = subword_freq[subword0]
#     for dimention in subword0_wv:
#         function_wv.append(dimention * freq)
#     sum_freq = freq
#     for i in range(1,len(functionSubword[functionName])):
#         subword = functionSubword[functionName][i]
#         subword_wv = model.wv[subword]
#         freq = subword_freq[subword]
#         sum_freq += freq
#         for j in range(0,len(subword_wv)):
#             function_wv[j] += subword_wv[j] * freq
#     for i in range(0,len(function_wv)):
#         function_wv[i] = function_wv[i] / sum_freq
#     function_wv = normalize(function_wv)
#     functionvecList.append(function_wv)
#     function2vec[functionName] = function_wv

# print("loading freqFuncDepFile: {}".format(os.path.abspath(freqFuncDepFile)))
# fdepfreq = open(freqFuncDepFile, "r")
# lines = fdepfreq.readlines()
# i = 1
# for line in lines:
#     if i % 3 == 1:
#         read_line = line.split(' ')
#         #print(read_line)
#         funcname = read_line[0]
#         depcnt = int(read_line[1].strip('\n'))
#         dep_freq = {}
#     elif i % 3 == 2:
#         read_line = line.split(' ')
#         for j in range(depcnt):
#             dep_func = read_line[2*j]
#             freq = read_line[2*j+1]
#             dep_freq[dep_func] = int(freq)
#     elif i % 3 == 0:
#         api_depfuncfreq[funcname] = dep_freq
#     #判断最后一行
#     if line is lines[-1]:
#         api_depfuncfreq[funcname] = dep_freq
#     i += 1	
# fdepfreq.close()

# #api_depfuncfreq = {}
# #dep_freq = {}
# print("loading expandContextFile: {}".format(os.path.abspath(expendContextFile)))
# fexpand = open(expendContextFile,"r")
# for line in fexpand.readlines():
#     read_line = line.split(' ')
#     #print(read_line)
#     if len(read_line) == 1:
#         if line != '\n':
#             functionName = line.strip("\n")
#             #print("functionName:",functionName)
#             dep_freq = {}
#         else:
#             if dep_freq:
#                 api_depfuncfreq[functionName] = dep_freq
#     else:
#         contextFunc = read_line[0]
#         freq = int(read_line[1].strip("\n"))
#         dep_freq[contextFunc] = freq
# fexpand.close()

#上下文不加频率
# for function in api_depfuncfreq.keys():
#     contextVec = []
#     for dep in api_depfuncfreq[function].keys():
#         if dep in function2vec.keys():
#             dep_vec = function2vec[dep]
#             contextVec.append(dep_vec)
#     if contextVec:
#         api_contexts_vec[function] = contextVec
        
#对每个api的上下文向量进行dbSCAN聚类，并求质心作为其上下文向量
# print('starting context dbScan...')
# for api,contexts_vec in api_contexts_vec.items():
#     #api = item.key()
#     #contexts_vec = item.value()
#     #print(api)
#     #print(contexts_vec)
#     db = DBSCAN(eps=0.8, min_samples=10).fit(contexts_vec)
#     #print(db)
#     labels = db.labels_
#     #print(labels)
#     num_clusters = len(set(labels)) - (1 if -1 in labels else 0)
#     #print(num_clusters)
#     #上下文无法形成聚类，将上下文向量的质心作为其上下文
#     if num_clusters == 0:
#         centroid_of_context = np.mean(contexts_vec, axis=0)
#         api_contexts_centroid[api] = [centroid_of_context]
#     #上下文形成聚类，将每个聚类向量的质心作为其一个上下文
#     else:
#         for count in range(num_clusters):
#             cluster_vec = []
#             #print('Cluster', count, ':')
#             for num,label in enumerate(labels):
#                 if label == count:
#                     cluster_vec.append(contexts_vec[num])        
#                     #print(contexts_vec[num])
#             centroid_of_cluster = np.mean(cluster_vec, axis=0)
#             #print('centroid_of_cluster:',centroid_of_cluster)
#             if api in api_contexts_centroid.keys():
#                 api_contexts_centroid[api].append(centroid_of_cluster)
#             else:
#                 api_contexts_centroid[api] = [centroid_of_cluster]  
#     #print(api,api_contexts_centroid[api])

# seed_api = 'kmalloc'
# seed_wv = function2vec[seed_api]
# seed_contexts_centroid = api_contexts_centroid[seed_api]
print("start DBScan.")
db = DBSCAN(eps=0.7, min_samples=100).fit(functionvecList)
labels = db.labels_
num_clusters = len(set(labels)) - (1 if -1 in labels else 0)
print("clusters num:",num_clusters)
#对所有函数的嵌入进行聚类，将聚类中与kmalloc相似度高的函数作为种子函数，对稀有函数进行类比推理，将相似度从高到低排序
for count in range(num_clusters):
    #cluster_vec = []
    function_cluster = []
    seed_freq_funcList = []
    rare_functionList = []
    print('Cluster', count, ':')
    for num,label in enumerate(labels):
        if label == count:
            #print('Cluster',count,'num:',num)
            #cluster_vec.append(functionvecList[num]) 
            function_cluster.append(functionNameList[num])  
            print(functionNameList[num])
    # for functionName in function_cluster:
    #     if functionName not in rare_funcs:
    #         if functionName in api_contexts_centroid.keys() and functionName in function2vec.keys():
    #             api_wv = function2vec[functionName]
    #             sim = []
    #             max_sim = 0
    #             for api_context_centroid in api_contexts_centroid[functionName]:
    #                 for seed_context_centroid in seed_contexts_centroid:
    #                     api_offset = api_wv - api_context_centroid
    #                     seed_offset = seed_wv - seed_context_centroid
    #                     #计算余弦相似度
    #                     similarity = np.dot(api_offset, seed_offset)/(np.linalg.norm(api_offset) * np.linalg.norm(seed_offset))
    #                     sim.append(similarity)
    #             #将相似度从高到低进行排序，取最高相似度
    #             sorted_sim = sorted(sim, reverse=True)
    #             max_sim = sorted_sim[0]
    #             if max_sim > 0.7:
    #                 print("max_sim > 0.7 function:",functionName)
    #                 seed_freq_funcList.append(functionName)
    #     else:
    #         rare_functionList.append(functionName)
    # if seed_freq_funcList and rare_functionList:
    #     for rare_function in rare_functionList:
    #         sim = []
    #         rare_wv = function2vec[rare_function]
    #         if rare_function not in api_contexts_centroid.keys():
    #             continue
    #         rare_contexts_centroid = api_contexts_centroid[rare_function]
    #         for key_function in seed_freq_funcList:
    #             key_wv = function2vec[key_function]
    #             key_contexts_centroid = api_contexts_centroid[key_function]
    #             for rare_context_centroid in rare_contexts_centroid:
    #                 for key_context_centroid in key_contexts_centroid:
    #                     rare_offset = rare_wv - rare_context_centroid
    #                     key_offset = key_wv - key_context_centroid
    #                     #计算余弦相似度
    #                     similarity = np.dot(rare_offset, key_offset)/(np.linalg.norm(rare_offset) * np.linalg.norm(key_offset))
    #                     sim.append(similarity)
    #                     #将相似度从高到低进行排序，取最高相似度
    #                     sorted_sim = sorted(sim, reverse=True)
    #                     api_sims[rare_function] = sorted_sim[0]
    #                     print(rare_function, api_sims[rare_function])
#将结果进行排序，从高到低进行输出
# print('output api and similirity:')
# sorted_api_sims = sorted(api_sims.items(), key = lambda kv:(kv[1], kv[0]), reverse=True)
# for item in sorted_api_sims:
#     print(item)
# print('end...')

'''
print("start DBScan.")
db = DBSCAN(eps=0.8, min_samples=100).fit(functionvecList)
labels = db.labels_
print(labels)
num_clusters = len(set(labels)) - (1 if -1 in labels else 0)
print(num_clusters)
#对所有函数的嵌入进行聚类，将聚类中与kmalloc相似度高的函数作为种子函数，对稀有函数进行类比推理，将相似度从高到低排序
for count in range(num_clusters):
    #cluster_vec = []
    function_cluster = []
    seed_freq_funcList = []
    rare_functionList = []
    #print('Cluster', count, ':')
    for num,label in enumerate(labels):
        if label == count:
            #print('Cluster',count,'num:',num)
            #cluster_vec.append(functionvecList[num]) 
            function_cluster.append(functionNameList[num])  
            print(functionNameList[num])     
    for functionName in function_cluster:
        if functionName not in rare_funcs:
            if functionName in api_contexts_centroid.keys() and functionName in function2vec.keys():
                api_wv = function2vec[functionName]
                sim = []
                max_sim = 0
                for api_context_centroid in api_contexts_centroid[functionName]:
                    for seed_context_centroid in seed_contexts_centroid:
                        api_offset = api_wv - api_context_centroid
                        seed_offset = seed_wv - seed_context_centroid
                        #计算余弦相似度
                        similarity = np.dot(api_offset, seed_offset)/(np.linalg.norm(api_offset) * np.linalg.norm(seed_offset))
                        sim.append(similarity)
                #将相似度从高到低进行排序，取最高相似度
                sorted_sim = sorted(sim, reverse=True)
                max_sim = sorted_sim[0]
                if max_sim > 0.7:
                    print("max_sim > 0.7 function:",functionName)
                    seed_freq_funcList.append(functionName)
        else:
            rare_functionList.append(functionName)
    if seed_freq_funcList and rare_functionList:
        for rare_function in rare_functionList:
            sim = []
            rare_wv = function2vec[rare_function]
            if rare_function not in api_contexts_centroid.keys():
                continue
            rare_contexts_centroid = api_contexts_centroid[rare_function]
            for key_function in seed_freq_funcList:
                key_wv = function2vec[key_function]
                key_contexts_centroid = api_contexts_centroid[key_function]
                for rare_context_centroid in rare_contexts_centroid:
                    for key_context_centroid in key_contexts_centroid:
                        rare_offset = rare_wv - rare_context_centroid
                        key_offset = key_wv - key_context_centroid
                        #计算余弦相似度
                        similarity = np.dot(rare_offset, key_offset)/(np.linalg.norm(rare_offset) * np.linalg.norm(key_offset))
                        sim.append(similarity)
                        #将相似度从高到低进行排序，取最高相似度
                        sorted_sim = sorted(sim, reverse=True)
                        api_sims[rare_function] = sorted_sim[0]
                        print(rare_function, api_sims[rare_function])


#将结果进行排序，从高到低进行输出
print('output api and similirity:')
sorted_api_sims = sorted(api_sims.items(), key = lambda kv:(kv[1], kv[0]), reverse=True)
for item in sorted_api_sims:
    print(item)

# print('end...')
# #print('centroid_of_cluster:',centroid_of_cluster)
# '''