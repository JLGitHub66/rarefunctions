import argparse
import os

'''
Usage:
    python3 RankingAndSim.py api_sequences.txt
    api_sequences.txt: the file containing the API sequences.
    ft.vec: the fastText model trained from the api_sequences.
'''
parser = argparse.ArgumentParser(description='get single free funcs')
parser.add_argument('apiSequences', metavar='apiSequences', type=str,
                    help='The file containing the API sequences for the trained model')

args = parser.parse_args()

Fseq = args.apiSequences

potential_apis = []
#加载api序列文件
print("loading API sequences: {}".format(os.path.abspath(Fseq)))
f = open(Fseq, "r")

#获得每个api的上下文函数及向量
for line in f.readlines():
    if line != '\n':
        read_line = line.split(' ')
        for an_api in read_line:
            if not an_api:
                continue
            if an_api == '\n':
                break
            else:
                if "printf" in an_api :
                    if an_api not in potential_apis:
                        potential_apis.append(an_api)

for potential_api in potential_apis:
    print(potential_api)