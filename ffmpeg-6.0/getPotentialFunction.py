import argparse
import os

'''
Usage:
    python3 RankingAndSim.py api_sequences.txt
    api_sequences.txt: the file containing the API sequences.
    ft.vec: the fastText model trained from the api_sequences.
'''
parser = argparse.ArgumentParser(description='get single free funcs')
parser.add_argument('rareFuncFile', metavar='known', type=str, 
                    help='The file containing rare function)')

args = parser.parse_args()

fRareFunc = args.rareFuncFile

print("loading rare function file: {}".format(os.path.abspath(fRareFunc)))
frare = open(fRareFunc, "r")
rare_funcs = frare.read().split('\n')
frare.close()

for rare_func in rare_funcs:
    if "alloc" in rare_func:
    #if "free" in rare_func or "release" in rare_func or "destory" in rare_func:
    #if rare_func.startswith("lock_") or rare_func.endswith("_lock") or "_lock_" in rare_func:
    #if rare_func.startswith("unlock_") or rare_func.endswith("_unlock") or "_unlock_" in rare_func:
    #if "printf" in rare_func:
        print(rare_func)