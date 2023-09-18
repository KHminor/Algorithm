import sys
from collections import deque

input = sys.stdin.readline
n,m = map(int,input().split())
mtx = [list(map(int,input().rstrip('\n').split())) for _ in range(n)]
q = deque([])
result = 0

for i in range(n):
    for j in range(m):
        if mtx[i][j]:
            q.append([i,j])

while q:
    y,x = q.popleft()
    for dy,dx in [[y-1,x],[y-1,x+1],[y,x+1],[y+1,x+1],[y+1,x],[y+1,x-1],[y,x-1],[y-1,x-1]]:
        if 0<=dy<n and 0<=dx<m and not mtx[dy][dx]:
            mtx[dy][dx] = mtx[y][x]+1
            result = max(result, mtx[y][x]+1)
            q.append([dy,dx])
print(result-1)