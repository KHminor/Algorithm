import sys
from collections import deque

input = sys.stdin.readline
n,m,r = map(int,input().split())
_dic = {i:[] for i in range(n+1)}
visit = [0]*(n+1)

for i in range(m):
    u,v = map(int,input().split())
    _dic[u].append(v)
    _dic[v].append(u)

for i in range(1,n+1): _dic[i].sort(reverse=True)

stack = deque([r])
cnt = 0
while stack:
    s = stack.pop()
    if visit[s]: continue
    cnt += 1
    visit[s] = cnt
    for i in _dic[s]:
        if not visit[i]: stack.append(i)
[print(i) for i in visit[1:]]