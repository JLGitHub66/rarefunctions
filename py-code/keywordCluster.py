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
parser.add_argument('funtionKeyWordFile', metavar='known', type=str, 
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
funtionKeyWordFile = args.funtionKeyWordFile
subword2vecFile = args.subword2vecFile
fRareFunc = args.rareFuncFile
freqFuncDepFile = args.freqFuncDepFile
expendContextFile = args.expendContextFile

api_contexts_vec = {}
api_contexts_centroid = {}
api_sims = {}
subword_freq = {}
functionKeyword = {}
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

print("loading funtionKeyWordFile: {}".format(os.path.abspath(funtionKeyWordFile)))
ffuntionSubword = open(funtionKeyWordFile, "r")
i = 1
for line in ffuntionSubword.readlines():
    if line != "\n":
        if i % 3 == 1:
            functionName = line.strip("\n")
        elif i % 3 == 2:
            keyword = line.strip("\n")
    else:
        functionKeyword[functionName] = keyword
        keyword_wv = model.wv[keyword]
        func_keyvec[functionName] = model.wv[keyword]
        keyvecList.append(keyword_wv)
        functionNameList.append(functionName)
    i += 1

#对所有函数的嵌入进行聚类，将聚类中与kmalloc相似度高的函数作为种子函数，对稀有函数进行类比推理，将相似度从高到低排序
print("start DBScan.")
db = DBSCAN(eps=0.7, min_samples=1000).fit(keyvecList)
labels = db.labels_
num_clusters = len(set(labels)) - (1 if -1 in labels else 0)
print("clusters num:",num_clusters)
for count in range(num_clusters):
    #cluster_vec = []
    function_cluster = []
    seed_freq_funcList = []
    rare_functionList = []
    print('Cluster', count, ':')
    for num,label in enumerate(labels):
        if label == count:
            function_cluster.append(functionNameList[num])  
            print(functionNameList[num])
