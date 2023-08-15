from gensim.models import FastText
from gensim.test.utils import datapath
import os
from gensim.test.utils import get_tmpfile
from gensim.models import KeyedVectors
import numpy as np
import argparse

'''
Usage:
    python3 api_sequences.txt
    api_sequences.txt: the file containing the API sequences.
'''
parser = argparse.ArgumentParser(description='get the each api counts from a txt. if an api occurs many times in one function, just count 1')
parser.add_argument('apiSequences', metavar='known', type=str, 
                    help='The file containing API sequences)')

args = parser.parse_args()

FApiSequence = args.apiSequences

f = open(FApiSequence, "rt")

print("loading API Sequences file: {}".format(os.path.abspath(FApiSequence)))

results = {}

for line in f.readlines():
    if line != '\n':
        apis_line = []
        read_line = line.split(' ')
        for an_api in read_line:
            if an_api in apis_line:
                continue
            elif an_api == '\n':
                break
            else:
                apis_line.append(an_api)
        for api in apis_line:
            if api in results:
                results[api] = results[api] + 1
            else:
                results[api] = 1
            #print('{} {}'.format(api, results[api]))
    else:
        continue
f.close()

print('sorting...')
sorted_results = sorted(results.items(), key = lambda kv:(kv[1], kv[0]), reverse=False)

for item in sorted_results:
    #if item[1] <= 10:
        print('{}'.format(item[0]))
