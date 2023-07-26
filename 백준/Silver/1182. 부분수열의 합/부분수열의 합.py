import sys
input = sys.stdin.readline
n,s = map(int,input().split())
a = list(map(int,input().split()))
cnt = 0
for i in range(1 << n):
    li = []
    for j in range(n):
        if i & (1<<j): li.append(a[j])
    if sum(li) == s and li != []: 
        cnt += 1
print(cnt)