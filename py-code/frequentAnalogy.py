import os
import numpy as np
import argparse
from sklearn.cluster import DBSCAN
from posixpath import split
from gensim.models import FastText

'''
Usage:
    python3 frequentAnalogy.py freqfuncDep.txt FastText.vec seed.txt
    freqfuncDep.txt: The file containing function dependence.
    FastText.vec: The file containing FastText model
    seed.txt: The file containing seed APIs
'''

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

parser = argparse.ArgumentParser(description='Analogy reasoning for frequent function with function context')

parser.add_argument('freqFuncDepFile', metavar='known', type=str, 
                    help='The file containing function dependence)')
parser.add_argument('FastTextFile', metavar='known', type=str, 
                    help='The file containing FastText model)')
parser.add_argument('seed', metavar='seed', type=str, 
                    help='The file containing seed APIs)')

args = parser.parse_args()
freqFuncDepFile = args.freqFuncDepFile
FastTextFile = args.FastTextFile
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

print("loading model: {}".format(os.path.abspath(FastTextFile)))
model = FastText.load(FastTextFile)

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
    if line is lines[-1]:
        api_depfuncfreq[funcname] = dep_freq
    i += 1	
fdepfreq.close()

for function in api_depfuncfreq.keys():
    contextVec = []
    for dep in api_depfuncfreq[function].keys():
        dep_vec = model.wv[dep]
        for i in range(api_depfuncfreq[function][dep]):
            contextVec.append(dep_vec)
    if contextVec:
        api_contexts_vec[function] = contextVec

print('starting context dbScan...')
for api,contexts_vec in api_contexts_vec.items():
    db = DBSCAN(eps=0.8, min_samples=10).fit(contexts_vec)
    labels = db.labels_
    num_clusters = len(set(labels)) - (1 if -1 in labels else 0)
    if num_clusters == 0:
        centroid_of_context = np.mean(contexts_vec, axis=0)
        api_contexts_centroid[api] = [centroid_of_context]
    else:
        for count in range(num_clusters):
            cluster_vec = []
            for num,label in enumerate(labels):
                if label == count:
                    cluster_vec.append(contexts_vec[num])        
            centroid_of_cluster = np.mean(cluster_vec, axis=0)
            if api in api_contexts_centroid.keys():
                api_contexts_centroid[api].append(centroid_of_cluster)
            else:
                api_contexts_centroid[api] = [centroid_of_cluster]

for seed_api in seed_func:
    if model.wv.has_index_for(seed_api):
        seed_wv = model.wv[seed_api]
        if seed_api in api_contexts_centroid.keys():
            seed_contexts_centroid = api_contexts_centroid[seed_api]
            for api,contexts_centroid in api_contexts_centroid.items():
                api_wv = model.wv[api]
                sim = []
                for api_context_centroid in contexts_centroid:
                    for seed_context_centroid in seed_contexts_centroid:
                        api_offset = api_wv - api_context_centroid
                        seed_offset = seed_wv - seed_context_centroid
                        similarity = np.dot(api_offset, seed_offset)/(np.linalg.norm(api_offset) * np.linalg.norm(seed_offset))
                        sim.append(similarity)
                sorted_sim = sorted(sim, reverse=True)
                if api not in api_sims.keys():
                    api_sims[api] = sorted_sim[0]
                elif sorted_sim[0] > api_sims[api]:
                    api_sims[api] = sorted_sim[0]
            
print('output api and similirity:')
fresult = open("frequent-analogy-result.txt","w")
sorted_api_sims = sorted(api_sims.items(), key = lambda kv:(kv[1], kv[0]), reverse=True)
rank = 1
for item in sorted_api_sims:
    if (item[1] >= 0.5):
        print(item[0], file = fresult)
fresult.close()
print('end...')