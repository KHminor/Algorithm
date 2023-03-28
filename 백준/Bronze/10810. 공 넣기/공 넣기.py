import sys
n,m = map(int,sys.stdin.readline().split())
li = [0 for _ in range(n+1)]

for _ in range(m):
    i,j,k = map(int,sys.stdin.readline().split())
    for i in range(i,j+1):
        li[i] = k
print(*li[1:])