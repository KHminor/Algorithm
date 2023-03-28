import sys
n,m = map(int,sys.stdin.readline().split())

li = [i for i in range(n+1)]

for _ in range(m):
    i,j = map(int,sys.stdin.readline().split())
    li[i],li[j] = li[j],li[i]
print(*li[1:])