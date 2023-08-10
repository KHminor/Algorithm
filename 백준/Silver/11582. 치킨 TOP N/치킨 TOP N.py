def CTP(li):
    global k, n
    if len(li) == 1: return li
    mid = len(li)//2
    left, right = CTP(li[:mid]), CTP(li[mid:])
    if k == n//mid: result.append(left+right)
    return sorted(left+right)


import sys
input = sys.stdin.readline
n = int(input())
li = list(map(int,input().split()))
k = int(input())
result = []
if k == n: print(*li)
elif k == 1: print(*sorted(li))    
else: 
    CTP(li)
    for i in result: print(*i, end=' ')