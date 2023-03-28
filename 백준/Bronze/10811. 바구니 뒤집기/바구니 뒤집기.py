import sys
n,m = map(int,sys.stdin.readline().split())

li = [i for i in range(n+1)]
for _ in range(m):
    i,j = map(int,sys.stdin.readline().split())
    x = 0
    if (i-j)%2:
        x = ((j-i)//2)+1
    else :
        x = (j-i)//2
    for k in range(x):
        li[i+k],li[j-k] = li[j-k],li[i+k]
print(*li[1:])