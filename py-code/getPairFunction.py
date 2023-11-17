import os
import numpy as np
import argparse
from posixpath import split

'''
Usage:
    python3 getPairFunction.py function.txt api_sequence.txt
    function.txt: The file containing functions need to check whether there is a pair function.
    api_sequence.txt: The file containing API sequences for source code.
'''

parser = argparse.ArgumentParser(description='get function result with paired function')

parser.add_argument('functionFile', metavar='known', type=str, 
                    help='The file containing functions need to check whether there is a pair function')
parser.add_argument('fApiSequence', metavar='known', type=str, 
                    help='The file containing API sequences for source code')

args = parser.parse_args()
fFunc = args.functionFile
fApiSequence = args.fApiSequence

fFunc = open(fFunc, "r")
funcs = fFunc.read().split('\n')
fFunc.close()

funcs2 = set()
fapiSequence = open(fApiSequence, "r")
for line in fapiSequence.readlines():
    apiSequence = line.split()
    for api in apiSequence:
        if api != "\n":  
            funcs2.add(api)
fapiSequence.close()

frightresult = open("pair-function-result.txt","w")
cnt = 0
for func in funcs:
    if (("lock" in func and func.replace("lock", "unlock") in funcs2)):
        print(func, file = frightresult)
frightresult.close()