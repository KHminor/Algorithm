import sys
from collections import deque
input = sys.stdin.readline
n,m = map(int,input().split())
arr = [[] for _ in range(n+1)]
li = [0]*(n+1)
mx = 0
for _ in range(m):
    a,b = map(int,input().split())
    arr[b].append(a)

for i in range(1,n+1):
    visit = [False]*(n+1)
    q = deque([i])
    visit[i] = True
    while q:
        li[i] += 1 
        s = q.popleft()
        for x in arr[s]:
            if not visit[x]:
                visit[x] = True
                q.append(x)
    if li[i] > mx: mx = li[i]

[print(i, end=' ') for i in range(1,n+1) if li[i] == mx]
