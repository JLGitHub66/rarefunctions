import os
import numpy as np
import argparse
import random
from sklearn.cluster import DBSCAN
from posixpath import split
from gensim.models import Word2Vec

parser = argparse.ArgumentParser(description='get the each api counts from a txt. if an api occurs many times in one function, just count 1')

parser.add_argument('functionFile1', metavar='known', type=str, 
                    help='The file containing subword count)')
# parser.add_argument('functionFile2', metavar='known', type=str, 
#                     help='The file containing function and its subword)')

args = parser.parse_args()
fFunc1 = args.functionFile1
#fFunc2 = args.functionFile2

ffunc1 = open(fFunc1, "r")
funcs1 = ffunc1.read().split('\n')
ffunc1.close()

# ffunc2 = open(fFunc2, "r")
# funcs2 = ffunc2.read().split('\n')
# ffunc2.close()

# for func in funcs2:
#     if func not in funcs1:
#         funcs1.append(func)

fresult = open("lock-random-Result.txt","w")
random_lock = random.sample(funcs1, k = 100)
for lock_func in random_lock:
    print(lock_func)
fresult.close()

# fresult = open("lock-random-Result.txt","w")
# index = 1
# i = 1
# for func in funcs1:
#     #print(func)
#     items = func.split("   ")
#     #print(items[1])
#     if "btrfs" not in items[1]:
#         print(str(index) + " " + items[1], file = fresult)
#         index += 1
# fresult.close()