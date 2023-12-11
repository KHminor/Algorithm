import sys
input = sys.stdin.readline

n,m = map(int,input().split())
li = [0]*(n+1)
for _ in range(m):
    i,j,k = map(int,input().split())
    for x in range(i,j+1): li[x] = k
print(*li[1:])