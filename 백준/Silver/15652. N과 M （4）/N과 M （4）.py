import sys

def find(s,cnt):
    global n,m
    if cnt == m:
        print(*li)
        return
    for i in range(s,n+1):
        li[cnt] = i
        find(i,cnt+1)
        li[cnt] = 0

input = sys.stdin.readline
n,m = map(int,input().split())
li = [0]*m
find(1,0)