import os
import numpy as np
import argparse
import sys
import time

'''
Usage:
    python3 expandContext.py FunctionDependenceFrequence.txt FunctionDependenceArgument.txt FunctionImplement.txt rare_func.txt
    FunctionDependenceFrequence.txt: the file containing function context with its frequence
    FunctionDependenceArgument.txt: the file containing function context with its argument
    FunctionImplement.txt: the file containing function with its connected functions in its implementation
    rare_func.txt:the file containing rare functions result
'''

parser = argparse.ArgumentParser(description='expend rare function context with data connection files')

parser.add_argument('FunctionDependenceFrequence', metavar='known', type=str, 
                    help='The file containing function dependence frequence)')
parser.add_argument('FunctionDependenceAugument', metavar='known', type=str, 
                    help='The file containing function dependence augument)')
parser.add_argument('FunctionImplement', metavar='known', type=str, 
                    help='The file containing function implement)')
parser.add_argument('rareFunc', metavar='known', type=str, 
                    help='The file containing rare functions that needed to expand context)')

args = parser.parse_args()

fFuncDepFreq = args.FunctionDependenceFrequence
fFuncDepAug = args.FunctionDependenceAugument
fFuncImp = args.FunctionImplement
fRareFunc = args.rareFunc

print(time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()))

print("loading rare function file: {}".format(os.path.abspath(fRareFunc)))
frare = open(fRareFunc, "r")
rare_funcs = frare.read().split('\n')
frare.close()

print("loading function dependence augument file: {}".format(os.path.abspath(fFuncDepAug)))
fdeparg = open(fFuncDepAug, "r")
api_depfuncarg = {}
funcname = ""
dep_arg = {}
for line in fdeparg.readlines():
    if line != '\n':
        if "," not in line:
            funcname = line.strip('\n')
            dep_arg = {}
        else:
            read_line = line.split(',')
            dep_func = read_line[0].strip(' ')
            argument = read_line[1].split(';')
            arg_index = {}
            i = 1
            argname = ""
            for arg in argument:
                if arg != "" and arg != "\n":
                    if i % 2 == 1:
                        argname = arg
                    elif i % 2 == 0:
                        arg_index[argname] = int(arg)
                    i += 1
            dep_arg[dep_func] = arg_index
    else:
        api_depfuncarg[funcname] = dep_arg
fdeparg.close()

fdepfreq = open(fFuncDepFreq, "r")
api_depfuncfreq = {}
dep_freq = {}
lines = fdepfreq.readlines()
i = 1
for line in lines:
    if i % 3 == 1:
        read_line = line.split(' ')
        funcname = read_line[0]
        depcnt = int(read_line[1].strip('\n'))
        dep_freq = {}
    elif i % 3 == 2:
        read_line = line.split(' ')
        for j in range(depcnt):
            dep_func = read_line[2*j]
            freq = read_line[2*j+1]
            dep_freq[dep_func] = int(freq)
    elif i % 3 == 0:
        api_depfuncfreq[funcname] = dep_freq
    if line is lines[-1]:
        api_depfuncfreq[funcname] = dep_freq
    i += 1	
fdepfreq.close()

print("loading API Implements file: {}".format(os.path.abspath(fFuncImp)))
ffuncimp = open(fFuncImp, "r")
def_funcarg = {}
funcname = ""
func_arg = {}
for line in ffuncimp.readlines():
    if line != '\n':
        read_line = line.split(':')
        if len(read_line) != 2:
            continue
        getType = read_line[0]
        if getType == "DefFunction":
            funcname = read_line[1].split(" ")[1].strip('\n')
        elif getType == "function":
            depfunc = read_line[1].split(",")
            depname = depfunc[0].split(" ")[1]
            paramIndex = depfunc[1].split(" ")
            for param in paramIndex:
                if param != "" and param != "\n":
                    index = int(param)
                    if depname in func_arg:
                        if index not in func_arg[depname]:
                                func_arg[depname].append(index)
                    else:
                        func_arg[depname] = [index]
    else:
        if func_arg:
            def_funcarg[funcname] = func_arg
            func_arg = {}
ffuncimp.close()

expand_context = {}
def expandContext():
    for func in api_depfuncfreq.keys():
        depfuncfreq = api_depfuncfreq[func]
        iter_already_expand_funcs = [func]
        recur_already_expand_funcs = [func]
        for depfunc in depfuncfreq.keys():
            if depfunc not in rare_funcs:
                if func in expand_context.keys():
                    if depfunc in expand_context[func].keys():
                        expand_context[func][depfunc] += depfuncfreq[depfunc]
                    else:
                        expand_context[func][depfunc] = depfuncfreq[depfunc]
                else:
                    depfreq = {}
                    depfreq[depfunc] = depfuncfreq[depfunc]
                    expand_context[func] = depfreq
            else:
                if func in api_depfuncarg.keys():
                    funcarg = api_depfuncarg[func]
                    if depfunc in funcarg.keys():
                        argMap = funcarg[depfunc]
                        iterExpandContext(func, depfunc, argMap, iter_already_expand_funcs, recur_already_expand_funcs)
                        recurExpandImplement(func, depfunc, argMap, recur_already_expand_funcs)
        if func in expand_context.keys():
            for depfunc in expand_context[func].keys():
                freq = expand_context[func][depfunc]

def iterExpandContext(func, depfunc, argMap, iter_already_expand_funcs, recur_already_expand_funcs):
    if func == depfunc:
        return
    if depfunc in iter_already_expand_funcs:
        return
    iter_already_expand_funcs.append(depfunc)
    if depfunc not in api_depfuncfreq.keys() or depfunc not in api_depfuncarg.keys():
        return
    depfunc_context = api_depfuncfreq[depfunc]

    for ddepfunc in depfunc_context.keys():
        if ddepfunc in iter_already_expand_funcs:
            continue
        if ddepfunc in api_depfuncarg[depfunc].keys():
            aargMap = api_depfuncarg[depfunc][ddepfunc]
            for aarg in aargMap.keys():
                if aarg in argMap.keys():
                    if ddepfunc not in rare_funcs:
                        depfuncfreq = api_depfuncfreq[depfunc]
                        if func in expand_context.keys():
                            if ddepfunc in expand_context[func].keys():
                                expand_context[func][ddepfunc] += depfuncfreq[ddepfunc]
                            else:
                                expand_context[func][ddepfunc] = depfuncfreq[ddepfunc]
                        else:
                            depfreq = {}
                            depfreq[ddepfunc] = depfuncfreq[ddepfunc]
                            expand_context[func] = depfreq
                    else:
                        iterExpandContext(func, ddepfunc, argMap, iter_already_expand_funcs, recur_already_expand_funcs)
                        recurExpandImplement(func, ddepfunc, aargMap, recur_already_expand_funcs)
        

def recurExpandImplement(func, depfunc, argMap, recur_already_expand_funcs):
    if func == depfunc:
        return
    if depfunc in recur_already_expand_funcs:
        return
    recur_already_expand_funcs.append(depfunc)
    if depfunc not in def_funcarg.keys():
        return
    depfunc_imp = def_funcarg[depfunc]
    for imp_func in depfunc_imp.keys():
        if imp_func in recur_already_expand_funcs:
            continue
        aargIndex = depfunc_imp[imp_func]
        for index in aargIndex:
            if index in argMap.values():
                if imp_func not in rare_funcs:
                    if func in expand_context.keys():
                        if imp_func in expand_context[func].keys():
                            expand_context[func][imp_func] += 1
                        else:
                            expand_context[func][imp_func] = 1
                    else:
                        impfreq = {}
                        impfreq[imp_func] = 1
                        expand_context[func] = impfreq
                else:
                    recurExpandImplement(func, imp_func, argMap, recur_already_expand_funcs)
expandContext()

print(time.strftime("%Y-%m-%d %H:%M:%S", time.localtime()))