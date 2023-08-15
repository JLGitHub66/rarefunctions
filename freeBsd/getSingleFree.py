import argparse
import os

'''
Usage:
    python3 RankingAndSim.py api_sequences.txt
    api_sequences.txt: the file containing the API sequences.
    ft.vec: the fastText model trained from the api_sequences.
'''
parser = argparse.ArgumentParser(description='get single free funcs')
parser.add_argument('PairFree', metavar='PairFree', type=str, 
                    help='The file containing the alloc-like API)')
parser.add_argument('SingleFree', metavar='SingleFree', type=str,
                    help='The file containing the free-like API')

args = parser.parse_args()

FPairFree = args.PairFree
FSingleFree = args.SingleFree

#print("loading old API: {}".format(os.path.abspath(FPairFree)))
fPairFree = open(FPairFree, "r")
pair_apis = fPairFree.read().split('\n')
fPairFree.close()

#print("loading new API: {}".format(os.path.abspath(FSingleFree)))
fSingleFree = open(FSingleFree, "r")
single_apis = fSingleFree.read().split('\n')
fSingleFree.close()

'''
for single_api in single_apis:
    if "-" in single_api or ">" in single_api or "~" in single_api or "(" in single_api or "%" in single_api or "," in single_api or ":" in single_api or "*" in single_api or "\"" in single_api:
        continue
    api = single_api.split(' ')
    print(api[0])
'''

for single_api in single_apis:
    if "free" in single_api or "release" in single_api or "destroy" in single_api:
        print(single_api)