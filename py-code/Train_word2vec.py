from gensim.models import Word2Vec
from gensim.test.utils import datapath
import os
import argparse


parser = argparse.ArgumentParser(description='Embedding the APIs with Word2Vec.')
parser.add_argument('input', metavar='input', type=str, 
                    help='The file containing the original or preprocessed slices (API sequences)')
parser.add_argument('output', metavar='output', type=str, 
                    help='The file for dumping the Word2Vec model')
parser.add_argument('-v', '--vector_size', default=100, 
                    help='Vector dimension of the embeddings (default: 100)')
parser.add_argument('-w', '--window', default=5,
                    help='Windows size for Word2Vec (default: 5)')
parser.add_argument('-p', '--workers', default=12,
                    help='Workers size for Word2Vec (set it depending on the #CPU_cores)')


args = parser.parse_args()

Finput = os.path.abspath(args.input)
Foutput = args.output
Vector = args.vector_size
Window = args.window
Workers = args.workers

print("corpus_file: {}".format(Finput))
corpus_file = datapath(Finput)

print('create Word2Vec instance')
model = Word2Vec(vector_size=Vector, window=Window, min_count=1, epochs=5, sg=1, workers=Workers)

print('build vocabulary')
model.build_vocab(corpus_file=corpus_file)

total_words = model.corpus_total_words

print('train the model')
model.train(corpus_file=corpus_file,total_words=total_words,epochs=5)

print('save the model to {}'.format(Foutput))
model.save(Foutput)

