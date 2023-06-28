import sys
from collections import deque

n, m, v = map(int,sys.stdin.readline().split())

_dict = {i:[] for i in range(n+1)}
for i in range(m):
    s,e = map(int,sys.stdin.readline().split())
    _dict[s].append(e)
    _dict[e].append(s)

stack, s_dfs, que, q_bfs = [v], [], deque([v]), [] # dfs = stack, s_dfs, bfs = que, q_bfs
visit = [0]*(n+1) # 방문 체크

# dfs
while stack:
    node = stack.pop()
    
    # 방문 체크
    if visit[node]: continue
    visit[node] = 1 

    # stack은 가장 큰 값부터 검사해서, 정점 번호가 작은 것을 먼저 방문하도록 내림차순 정렬
    for i in sorted(_dict[node], reverse=True): 
        if not visit[i]: stack.append(i)
    s_dfs.append(node)

visit = [0]*(n+1) # 방문 초기화
# dfs
while que:
    node = que.popleft()

    # 방문 체크
    if visit[node]: continue
    visit[node] = 1 

    # que는 앞에서부터 pop 시키기 때문에 오름차순 정렬
    for i in sorted(_dict[node]): 
        if not visit[i]: que.append(i)
    q_bfs.append(node)

print(*s_dfs)
print(*q_bfs)