import sys

n = int(sys.stdin.readline())
li = list(map(int,sys.stdin.readline().split()))
m = int(sys.stdin.readline())
ch_li = list(map(int,sys.stdin.readline().split()))

dic = {}
for i in li:
    dic[i] = 1

for i in ch_li:
    if dic.get(i):
        print(dic[i], end=' ')
    else:
        print(0, end= ' ')