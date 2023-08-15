import sys
from collections import deque

input = sys.stdin.readline
n,m = map(int,input().split())
_dic = {i:[] for i in range(1,n+1)}
visit = [0]*(n+1)

for _ in range(m):
    u,v = map(int,input().split())
    _dic[u].append(v)
    _dic[v].append(u)

for i in range(1,n+1):
    if visit[i]: continue
    visit[i] = i
    q = deque(_dic[i])

    while q:
        num = q.popleft()
        # if visit[num]: continue
        visit[num] = i
        for j in _dic[num]:
            if visit[j]: continue
            visit[j] = i
            q.append(j)
print(len(set(visit))-1)