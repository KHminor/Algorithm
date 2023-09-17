import sys
from collections import deque
input = sys.stdin.readline

n,m = map(int,input().split())
mtx = [[0]*n for _ in range(n)]
visit = [[0]*n for _ in range(n)]
x,y = map(int,input().split())
result = []
for _ in range(m):
    a,b = map(int,input().split())
    mtx[a-1][b-1] = -1
    result.append([a-1,b-1])

visit[x-1][y-1] = 1
q = deque([[x-1,y-1,0]])
check = 0
while q:
    _x,_y,cnt = q.popleft()
    for dx,dy in [[_x-2,_y-1],[_x-2,_y+1],[_x-1,_y-2],[_x-1,_y+2],[_x+1,_y-2],[_x+1,_y+2],[_x+2,_y-1],[_x+2,_y+1]]:
        if 0<=dx<n and 0<=dy<n and not visit[dx][dy]:
            if mtx[dx][dy] == -1: 
                check += 1
                mtx[dx][dy] = cnt+1
            if check == m: 
                q = []
                break
            else:
                visit[dx][dy] = 1
                q.append([dx,dy,cnt+1])

for x,y in result: print(mtx[x][y], end=' ')