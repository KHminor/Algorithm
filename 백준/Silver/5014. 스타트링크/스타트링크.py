import sys
from collections import deque
# dfs 활용
f,s,g,u,d = map(int,input().split())
result = sys.maxsize
visit = [False]*(f+1)
visit[s] = True # dfs는 방문하기 전 방문 체크해야 중복 X
q = deque([[s,0]])

while q:
    now,cnt = q.popleft()
    if now == g: result = min(result, cnt)
    else:
        for nt in [now+u,now-d]:
            if 0<nt<=f and not visit[nt]:
                visit[nt] = True
                q.append([nt,cnt+1])

if result == sys.maxsize: print("use the stairs")
else: print(result)