import sys
from collections import deque
input = sys.stdin.readline
m,n = map(int,input().split())
arr = [list(map(int,input().strip('\n').split())) for _ in range(n)]
visit = [[0]*m for _ in range(n)]
q = deque([])
result = 0

for i in range(n):
    for j in range(m):
        if arr[i][j] == 1: 
            visit[i][j] = 1
            q.append([i,j,0])
        elif arr[i][j] == -1: visit[i][j] = 1

while q:
    x,y,cnt = q.popleft()
    if cnt > result: result = cnt
    for a,b in [[-1,0],[1,0],[0,-1],[0,1]]:
        dx,dy = x+a, y+b
        if 0<=dx<n and 0<=dy<m and not arr[dx][dy] and not visit[dx][dy]:
            q.append([dx,dy,cnt+1])
            visit[dx][dy] = 1

flag = True
for i in range(n):
    for j in range(m):
        if not visit[i][j]:
            flag = False
            break
    if flag == False: break
if flag: print(result)
else: print(-1)