import sys
from collections import deque
for _ in range(int(input())):
    n,m = map(int,input().split())
    _dic = {i:[] for i in range(1,n+1)}
    result = 0
    for _ in range(m):
        a,b = map(int,input().split())
        _dic[a].append(b)
        _dic[b].append(a) 
    start = min(_dic, key=lambda x: len(_dic[x]))
    visit = [0]*(n+1) # 방문 국가 체크
    q = deque([start])
    visit[start] = 1
    while q:
        s = q.popleft() # bfs 사용
        for i in _dic[s]:
            if not visit[i]:
                visit[i] = 1
                result += 1
                q.append(i)
    print(result)