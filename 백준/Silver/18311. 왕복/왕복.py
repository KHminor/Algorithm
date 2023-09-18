import sys
input = sys.stdin.readline

n,k = map(int,input().split())
li = list(map(int,input().rstrip('\n').split()))
li = li+ li[::-1]
start = 0

for i in range(2*n):
    if start<=k<start+li[i]:
        if i>n-1: print(2*n-i)
        else: print(i+1)
        break
    start += li[i]