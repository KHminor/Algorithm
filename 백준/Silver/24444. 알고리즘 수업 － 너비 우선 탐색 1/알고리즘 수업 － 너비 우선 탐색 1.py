import sys
from collections import deque

input = sys.stdin.readline
n,m,r = map(int,input().split())
_dic = {i:[] for i in range(1,n+1)}
visit = [0]*(n+1)
cnt = 1
visit[r] = cnt

for i in range(m):
    u,v = map(int,input().split())
    _dic[u].append(v)
    _dic[v].append(u)

for i in range(1,n): _dic[i].sort()

q = deque([r])
while q:
    s = q.popleft()
    for i in _dic[s]:
        if not visit[i]:
            cnt += 1
            visit[i] = cnt
            q.append(i)
[print(i) for i in visit[1:]]