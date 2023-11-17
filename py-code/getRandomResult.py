import os
import numpy as np
import argparse
import random
from posixpath import split

'''
Usage:
    python3 getRandomResult.py AnalogyResult.txt
    freqfuncDep.txt: The file containing analogy reasoning result.
'''

parser = argparse.ArgumentParser(description='get random 100 result from analogy reasoning result.')

parser.add_argument('AnalogyResultFile', metavar='known', type=str, 
                    help='The file containing analogy reasoning result)')

args = parser.parse_args()
fResult = args.AnalogyResultFile

fResult = open(fResult, "r")
funcs = fResult.read().split('\n')
fResult.close()

fresult = open("random-Result.txt","w")
random_lock = random.sample(funcs, k = 100)
for lock_func in random_lock:
    print(lock_func)
fresult.close()
