import os
import numpy as np
import argparse
import sys
import time

'''
Usage:
    python3 expandContext.py FunctionDependenceFrequence.txt FunctionDependenceAugument.txt FunctionImplement.txt rare_func.txt
    api_sequences.txt: the file containing the API sequences.
    rareFunc.txt: the file containing rare function needed to expand
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
###遍历并存储数据关联函数及参数
fdeparg = open(fFuncDepAug, "r")
api_depfuncarg = {}
funcname = ""
dep_arg = {}
for line in fdeparg.readlines():
    if line != '\n':
        #print(line)
        if "," not in line:
            funcname = line.strip('\n')
            #print(funcname)
            dep_arg = {}
        else:
            read_line = line.split(',')
            dep_func = read_line[0].strip(' ')
            argument = read_line[1].split(';')
            arg_index = {}
            i = 1
            argname = ""
            #print(argument)
            for arg in argument:
                #print(arg, i)
                if arg != "" and arg != "\n":
                    #print(arg)
                    if i % 2 == 1:
                        argname = arg
                    elif i % 2 == 0:
                        arg_index[argname] = int(arg)
                    i += 1
            dep_arg[dep_func] = arg_index
    else:
        api_depfuncarg[funcname] = dep_arg
fdeparg.close()
'''
for func in api_depfuncarg.keys():
    print(func, api_depfuncarg[func])
'''

###遍历并存储数据关联函数及频率
fdepfreq = open(fFuncDepFreq, "r")
api_depfuncfreq = {}
dep_freq = {}
lines = fdepfreq.readlines()
i = 1
for line in lines:
    if i % 3 == 1:
        read_line = line.split(' ')
        #print(read_line)
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
    #判断最后一行
    if line is lines[-1]:
        api_depfuncfreq[funcname] = dep_freq
    i += 1	
fdepfreq.close()

'''
#for func in api_depfuncfreq.keys():
#    print(func, api_depfuncfreq[func])
'''

###遍历并存储函数定义中的数据关联函数及参数
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
            #print(read_line[1])
            depfunc = read_line[1].split(",")
            #print(depfunc)
            depname = depfunc[0].split(" ")[1]
            #print(depname)
            paramIndex = depfunc[1].split(" ")
            #print(paramIndex)
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
'''
for func in def_funcarg.keys():
    print(func, def_funcarg[func])
'''
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
        print(func)
        if func in expand_context.keys():
            for depfunc in expand_context[func].keys():
                freq = expand_context[func][depfunc]
                print(depfunc, freq)
        print()
        

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
                        #print("iterExpandContext","func:",func,"depfunc:",depfunc,"ddepfunc:",ddepfunc, "argMap:", argMap)
                        iterExpandContext(func, ddepfunc, argMap, iter_already_expand_funcs, recur_already_expand_funcs)
                        recurExpandImplement(func, ddepfunc, aargMap, recur_already_expand_funcs)
        

def recurExpandImplement(func, depfunc, argMap, recur_already_expand_funcs):
    #print("recurExpandImplement:","func:",func, "depfunc:",depfunc, "argMap:", argMap, "recur_already_expand_funcs:",recur_already_expand_funcs)
    if func == depfunc:
        return
    if depfunc in recur_already_expand_funcs:
        return
    recur_already_expand_funcs.append(depfunc)
    if depfunc not in def_funcarg.keys():
        return
    depfunc_imp = def_funcarg[depfunc]

    #print("func:",func, "depfunc:",depfunc, "argMap:", argMap)
    for imp_func in depfunc_imp.keys():
        #print("imp_func:", imp_func)
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