def NM(cnt,x):
    global n,m
    if cnt == m:
        print(*li)
        return
    for i in range(x,n+1):
        li.append(i)
        NM(cnt+1,i+1)
        li.pop()
    return

import sys
input = sys.stdin.readline
n,m = map(int,input().split())
li = []
NM(0,1)