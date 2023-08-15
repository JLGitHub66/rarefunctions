from tokenizers import Tokenizer
from tokenizers import normalizers
from tokenizers.normalizers import Lowercase,NFKD,StripAccents
from tokenizers import pre_tokenizers
from tokenizers.pre_tokenizers import Whitespace,Digits
from tokenizers.trainers import BpeTrainer,WordPieceTrainer,UnigramTrainer
from tokenizers.models import WordPiece,BPE,Unigram
from tokenizers import BertWordPieceTokenizer
'''
#进行分词
tokenizer=BertWordPieceTokenizer()
tokenizer.train(['api_sequences.txt'])

#sequence = "mhi_alloc_controller"
#tokenized_sequence = tokenizer.encode(sequence)
#decode_string = tokenizer.decode(tokenized_sequence.ids, skip_special_tokens=False)
#print(decode_string)

f = open('api_sequences.txt', "r")
for line in f.readlines():
    tokenized_sequence = tokenizer.encode(line)
    decode_string = tokenizer.decode(tokenized_sequence.ids, skip_special_tokens=False)
    print(decode_string)

'''

# Step 1：实例化一个空白的BPE tokenizer
tokenizer = Tokenizer(WordPiece(unk_token="[UNK]"))

# Step 2：实例化一个BPE tokenizer 的训练器 trainer 这里 special_tokens 的顺序决定了其id排序
trainer = WordPieceTrainer(
    special_tokens=["[UNK]", "[CLS]", "[SEP]", "[PAD]", "[MASK]"],
    min_frequency=1,
    show_progress=True,
    vocab_size=40000
)

# Step 3：定义预分词规则（比如以空格预切分）
tokenizer.pre_tokenizer = Whitespace()

# Step 4：加载数据集 训练tokenizer
files = [f"./api_sequences.txt"]
tokenizer.train(files, trainer)

# Step 5：保存 tokenizer 
tokenizer.save("./tokenizer-linux.json")

# 加载 tokenzier
#tokenizer = Tokenizer.from_file("./tokenizer-linux.json")

# 使用 tokenizer
f = open('api_sequences.txt', "r")
for line in f.readlines():
    tokenized_sequence = tokenizer.encode(line)
    for word in tokenized_sequence.tokens:
        print(word, end=" ")
    print()
