import sys
input = sys.stdin.readline
n,k = map(int,input().split())
li = [i for i in range(1,n+1)]
print('<',end='')
idx = 0
while li:
    ln = idx+k-1
    if ln >= len(li): ln = ln%len(li)
    if len(li) > 1: print(li[ln], end=', ')
    else: print(li[ln], end='>')
    del li[ln]
    idx = ln