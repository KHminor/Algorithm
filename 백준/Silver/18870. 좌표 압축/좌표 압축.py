import sys

n = int(sys.stdin.readline()[0])

li = list(map(int,sys.stdin.readline().split()))
st = sorted(list(set(li)))
st_ln = len(st)
st_li = dict.fromkeys(set(li),0)


for i in range(st_ln):
    st_li[st[i]] = i

for i in li:
    print(st_li[i], end=' ')
