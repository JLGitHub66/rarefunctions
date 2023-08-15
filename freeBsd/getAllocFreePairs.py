import argparse
import os

'''
Usage:
    python3 RankingAndSim.py api_sequences.txt ft.vec
    api_sequences.txt: the file containing the API sequences.
    ft.vec: the fastText model trained from the api_sequences.
'''
parser = argparse.ArgumentParser(description='get alloc-free pairs')
parser.add_argument('alloc', metavar='alloc', type=str, 
                    help='The file containing the alloc-like API)')
parser.add_argument('free', metavar='free', type=str,
                    help='The file containing the free-like API')
'''
parser.add_argument('old', metavar='old', type=str,
                    help='The file containing the free-like API')
'''

args = parser.parse_args()

Falloc = args.alloc
Ffree = args.free
#Fold = args.old

#print("loading alloc API: {}".format(os.path.abspath(Falloc)))
falloc = open(Falloc, "r")
alloc_apis = falloc.read().split('\n')
falloc.close()

#print("loading free API: {}".format(os.path.abspath(Ffree)))
ffree = open(Ffree, "r")
free_apis = ffree.read().split('\n')
ffree.close()

'''
#print("loading old API: {}".format(os.path.abspath(Fold)))
fold = open(Fold, "r")
old_apis = fold.read().split('\n')
fold.close()
'''


for alloc_api in alloc_apis:
    if "->" in alloc_api:
        continue
    if "alloc" in alloc_api:
        free_api = alloc_api.replace("alloc","free")
        if free_api in free_apis:
            print(free_api)
            continue
        free_api = alloc_api.replace("alloc","release")
        if free_api in free_apis:
            print(free_api)
            continue
        free_api = alloc_api.replace("alloc","dealloc")
        if free_api in free_apis:
            print(free_api)
            continue
        if "malloc" in alloc_api:
            free_api = alloc_api.replace("malloc","free")
            if free_api in free_apis:
                print(free_api)
                continue
    if "create" in alloc_api:
        free_api = alloc_api.replace("create","destroy")
        if free_api in free_apis:
            print(free_api)
            continue
'''
for alloc_api in alloc_apis:
    if "create" in alloc_api:
        free_api = alloc_api.replace("create","destroy")
        if free_api in free_apis:
            print(free_api)
'''



