import sys
from collections import deque
input = sys.stdin.readline

def bfs(height):
    while q:
        y,x = q.popleft()
        for ny,nx in [[-1,0],[1,0],[0,-1],[0,1]]:
            dy,dx = y+ny,x+nx
            if 0<=dy<n and 0<=dx<n and not visit[dy][dx] and arr[dy][dx] > height:
                visit[dy][dx] = 1
                q.append([dy,dx])

n = int(input())
arr = [list(map(int,input().split())) for _ in range(n)]
result = 0
q = deque([])
for height in range(0, max([max(arr[i]) for i in range(n)])+1):
    visit = [[0]*n for _ in range(n)]
    cnt = 0
    for i in range(n):
        for j in range(n):
            if not visit[i][j] and arr[i][j] > height:
                cnt += 1
                q.append([i,j])
                bfs(height)
    if cnt > result:
        result = cnt
print(result)