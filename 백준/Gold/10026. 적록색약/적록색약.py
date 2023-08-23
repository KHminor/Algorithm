import sys
from collections import deque

def bfs1():
    while q:
        y,x = q.popleft()
        for ny,nx in [[-1,0],[1,0],[0,-1],[0,1]]:
            dy,dx = y+ny,x+nx
            if 0<=dy<n and 0<=dx<n and not visit1[dy][dx] and arr[y][x] == arr[dy][dx]:
                visit1[dy][dx] = 1
                q.append([dy,dx])
    return

def bfs2():
    while q:
        y,x = q.popleft()
        for ny,nx in [[-1,0],[1,0],[0,-1],[0,1]]:
            dy,dx = y+ny,x+nx
            if 0<=dy<n and 0<=dx<n and not visit2[dy][dx]:
                if (arr[y][x] in ('R','G') and arr[dy][dx] in ('R','G')) or (arr[y][x] == 'B' and arr[dy][dx] == 'B'):
                    visit2[dy][dx] = 1
                    q.append([dy,dx])
    return

input = sys.stdin.readline
n = int(input())
arr = [list(input().rstrip('\n')) for _ in range(n)]

visit1 = [[0]*n for _ in range(n)] # 방문 체크
visit2 = [[0]*n for _ in range(n)] # 방문 체크
result1,result2 = 0,0
q = deque([])

for i in range(n):
    for j in range(n):
        if not visit1[i][j]: # 적록색약 x
            result1 += 1
            visit1[i][j] = 1
            q.append([i,j])
            bfs1()
        if not visit2[i][j]: # 적록색약 x
            result2 += 1
            visit2[i][j] = 1
            q.append([i,j])
            bfs2()
print(result1, end=' ')
print(result2)