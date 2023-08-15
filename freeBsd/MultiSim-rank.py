from gensim.models import FastText
from gensim.test.utils import datapath
import os
from gensim.test.utils import get_tmpfile
from gensim.models import KeyedVectors
import numpy as np
import argparse

'''
Usage:
    python3 MultiSim.py api_sequences.txt known_sensitives.txt ft.vec
    api_sequences.txt: the file containing the API sequences.
    known_sensitives.txt： the file containing the known alloc-like function
    ft.vec: the fastText model trained from the api_sequences.
'''
parser = argparse.ArgumentParser(description='Similarity between a keyword and multiple known sensitive ones.')
parser.add_argument('sequences', metavar='sequences', type=str, 
                    help='The file containing the API sequences for the trained model)')
parser.add_argument('known', metavar='known', type=str, 
                    help='The file containing known sensitive APIs)')
parser.add_argument('model', metavar='model', type=str,
                    help='The path to the FastText model')

args = parser.parse_args()

Fseq = args.sequences
Fknown = args.known
Fmodel = args.model 

#print("loading known APIs: {}".format(os.path.abspath(Fknown)))
f = open(Fknown, "r")
api_known = f.read().split('\n')
f.close()

print("loading API sequences: {}".format(os.path.abspath(Fseq)))
f = open(Fseq, "r")
api_seq = f.read().split('\n')
f.close()

print("loading model: {}".format(os.path.abspath(Fmodel)))
fname = datapath(os.path.abspath(Fmodel))
model = FastText.load(fname)
print("loading model: complete")

#target_api = 'mhi_alloc_controller'
#target2_api = 'kmalloc'

'''
apis = ['mhi_alloc_controller', 'nfp_cpp_area_alloc', 'sfp_alloc', 'xhci_alloc_stream_ctx', 'audioreach_alloc_graph_pkt', 'elfcorehdr_alloc', 'aq_nic_init', 'cdnsp_alloc_stream_info', 'sec_queue_aw_alloc', 'adev_alloc','nouveau_bo_alloc', 'amdgpu_vm_init', 'hfi1_alloc_ctxt_rcv_groups', 'init_mr_info', 'damon_new_ctx', 'init_rx_sa', 'init_tx_sa']
'''
results = {}

#print('compute cosine similarity...')

#alloc_wv = model.wv[target_api]
#kmalloc_wv = model.wv[target2_api]

for split_content in api_seq:
    s = split_content.split(' ')
    for w in s:
        if not w:
            continue
        elif w in results.keys():
            continue
        w_wv = model.wv[w]
        sim = []
        #对100个alloc-like进行遍历，分别与w计算相似度，去相似度最大值作为结果
        for alloc_like in api_known:
            if not alloc_like:
                continue
            if not model.wv.has_index_for(alloc_like):
                continue
                #print('No {} found in current version.'.format(an_api))
            else:
                alloc_wv = model.wv[alloc_like]
                similarity = np.dot(alloc_wv, w_wv)/(np.linalg.norm(alloc_wv) * np.linalg.norm(w_wv))
                sim.append(similarity)
        sorted_sim = sorted(sim, reverse=True)
        results[w] = sorted_sim[0]    
    
#将结果进行排序，从高到低进行输出
print('output api and similirity:')
sorted_results = sorted(results.items(), key = lambda kv:(kv[1], kv[0]), reverse=True)
for item in sorted_results:
    print(item[0])

print('end...')

#print('computing: complete')

#print('sorting...')
#sorted_results = sorted(results.items(), key = lambda kv:(kv[1], kv[0]), reverse=True)

#for item in sorted_results:
#    print('{} {} {}'.format(item[0], item[1], results2[item[0]]))

