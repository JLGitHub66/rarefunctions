import os
import numpy as np
import argparse
from sklearn.cluster import DBSCAN
from posixpath import split
from gensim.models import Word2Vec

parser = argparse.ArgumentParser(description='get the each api counts from a txt. if an api occurs many times in one function, just count 1')

parser.add_argument('functionFile1', metavar='known', type=str, 
                    help='The file containing subword count)')
parser.add_argument('fApiSequence', metavar='known', type=str, 
                    help='The file containing function and its subword)')

args = parser.parse_args()
fFunc1 = args.functionFile1
fApiSequence = args.fApiSequence

ffunc1 = open(fFunc1, "r")
funcs1 = ffunc1.read().split('\n')
ffunc1.close()

funcs2 = set()
fapiSequence = open(fApiSequence, "r")
for line in fapiSequence.readlines():
    apiSequence = line.split()
    for api in apiSequence:
        if api != "\n":  
            funcs2.add(api)
fapiSequence.close()

frightresult = open("lock-exist-unlock-Result.txt","w")
cnt = 0
for func1 in funcs1:
    if (("lock" in func1 and func1.replace("lock", "unlock") in funcs2)):
        print(func1, file = frightresult)
    #if ("alloc" in func and func.replace("alloc", "put") in funcs2) or ("alloc" in func and func.replace("alloc", "free") in funcs2) or ("malloc" in func and func.replace("malloc", "free") in funcs2) or ("alloc" in func and func.replace("alloc", "release") in funcs2)  or ("get" in func and func.replace("get", "put") in funcs2) or ("init" in func and func.replace("init", "fini") in funcs2) or ("allocate" in func and func.replace("allocate", "free") in funcs2):
    #if ("alloc" in func and func.replace("alloc", "free") in funcs2):
frightresult.close()