import argparse
import os

'''
Usage:
    python3 getPotentialFunction.py rare_func.txt
    api_sequences.txt: the file containing rare functions.
'''
parser = argparse.ArgumentParser(description='get potential functions with keyword')
parser.add_argument('rareFuncFile', metavar='known', type=str, 
                    help='The file containing rare function)')

args = parser.parse_args()

fRareFunc = args.rareFuncFile

print("loading rare function file: {}".format(os.path.abspath(fRareFunc)))
frare = open(fRareFunc, "r")
rare_funcs = frare.read().split('\n')
frare.close()

for rare_func in rare_funcs:
    if "alloc" in rare_func  or "create" in rare_func or "new" in rare_func or "init" in rare_func or "get" in rare_func:
    #if "free" in rare_func or "release" in rare_func or "destory" in rare_func:
    #if rare_func.startswith("unlock_") or rare_func.endswith("_unlock") or "_unlock_" in rare_func:
    #if "printf" in rare_func:
        print(rare_func)