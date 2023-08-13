import sys
from collections import deque
input = sys.stdin.readline
n,m = map(int,input().split())
arr = [list(map(int,input().rstrip('\n'))) for _ in range(n)]
visit = [[0]*m for _ in range(n)]
result = n*m
q = deque([[0,0,0]])
visit[0][0] = 1
while q:
    x,y,cnt = q.popleft()
    if (x,y) == (n-1,m-1) and result > cnt:
        result = cnt
        break
    for i,j in [[-1,0], [1, 0], [0, -1], [0, 1]]:
        dx, dy = x+i, y+j
        if 0<=dx<n and 0<=dy<m and arr[dx][dy] and not visit[dx][dy]: 
            visit[dx][dy] = 1
            q.append([dx,dy,cnt+1])
print(result+1)