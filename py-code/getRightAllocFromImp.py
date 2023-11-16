import os
import numpy as np
import argparse
from sklearn.cluster import DBSCAN
from posixpath import split
from gensim.models import Word2Vec

parser = argparse.ArgumentParser(description='get the each api counts from a txt. if an api occurs many times in one function, just count 1')

parser.add_argument('functionFile1', metavar='known', type=str, 
                    help='The file containing subword count)')
parser.add_argument('FunctionImplement', metavar='known', type=str, 
                    help='The file containing function and its subword)')

args = parser.parse_args()
fFunc1 = args.functionFile1
fFuncImp = args.FunctionImplement

ffunc1 = open(fFunc1, "r")
funcs1 = ffunc1.read().split('\n')
ffunc1.close()

###遍历并存储函数定义中的数据关联函数及参数
print("loading API Implements file: {}".format(os.path.abspath(fFuncImp)))
ffuncimp = open(fFuncImp, "r")
def_funcarg = {}
funcname = ""
func_dep = []
for line in ffuncimp.readlines():
    if line != '\n':
        read_line = line.split(':')
        if len(read_line) != 2:
            continue
        getType = read_line[0]
        if getType == "DefFunction":
            funcname = read_line[1].split(" ")[1].strip('\n')
        elif getType == "function":
            #print(read_line[1])
            depfunc = read_line[1].split(",")[0]
            #print(depfunc)
            #print(depname)
            #print(paramIndex)
            func_dep.append(depfunc)
    else:
        if func_dep:
            def_funcarg[funcname] = func_dep
            func_dep = []
ffuncimp.close()


frightresult = open("alloc-imp-Result.txt","w")
for func1 in funcs1:
    if func1 in def_funcarg.keys():
        for func2 in def_funcarg[func1]:
            if "alloc" in func2:
                print(func1, file = frightresult)
                break
        print("\n")
frightresult.close()