import os
from posixpath import split
import numpy as np
import argparse
import sys

parser = argparse.ArgumentParser(description='get the each api counts from a txt. if an api occurs many times in one function, just count 1')

parser.add_argument('wordPieceSequenceFile', metavar='known', type=str, 
                    help='The file containing wordpiece result)')

args = parser.parse_args()
WordPieceFile = args.wordPieceSequenceFile

functionSubword = {}
subwordCount = {}
subwordList = []
fWordPiece = open(WordPieceFile, "r")
linecnt = 1
for line in fWordPiece.readlines():
    print(linecnt)
    subwordLine = line.split()
    for subword in subwordLine:
        if subword != "\n":
            if subword.startswith("##"):
                oriWord = subword[2:]
                subwordList.append(oriWord)
                if oriWord in subwordCount.keys():
                    subwordCount[oriWord] += 1
                else:
                    subwordCount[oriWord] = 1
            else:
                if not subwordList:
                    subwordList.append(subword)
                else:
                    functionName = "".join(subwordList)
                    if functionName not in functionSubword.keys():
                        functionSubword[functionName] = subwordList
                    subwordList = [subword]
                if subword in subwordCount.keys():
                    subwordCount[subword] += 1
                else:
                    subwordCount[subword] = 1     
        else:
            functionName = "".join(subwordList)
            if functionName not in functionSubword.keys():
                functionSubword[functionName] = subwordList
            subwordList = []
    linecnt += 1 

fWordPiece.close()

subwordCountFile = open("subwordCount.txt","w")
for subword in subwordCount.keys():
    count = subwordCount[subword]
    subwordCountFile.write(subword + " " + str(count) + "\n")
subwordCountFile.close()

functionSubwordFile = open("functionSubword.txt","w")
for function in functionSubword.keys():
    functionSubwordFile.write(function + "\n")
    subwordList = functionSubword[function]
    for subword in subwordList:
        functionSubwordFile.write(subword + " ")
    functionSubwordFile.write("\n\n")
    