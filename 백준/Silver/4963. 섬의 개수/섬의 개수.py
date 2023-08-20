import sys
from collections import deque
input = sys.stdin.readline

while True:
    w,h = map(int,input().split())
    if not w and not h: break
    arr = [list(map(int,input().rstrip('\n').split())) for _ in range(h)]
    visit = [[0]*w for _ in range(h)]
    result = 0
    for i in range(h):
        for j in range(w):
            if arr[i][j] and not visit[i][j]: # 방문하지 않은 땅
                result += 1
                q = deque([[i,j]])
                visit[i][j] = 1
                while q:
                    y,x = q.popleft() # bfs
                    for a,b in [[-1,0],[1,0],[0,-1],[0,1],[-1,-1],[-1,1],[1,1],[1,-1]]:
                        dy, dx = y+a, x+b
                        if 0<=dy<h and 0<=dx<w and arr[dy][dx] and not visit[dy][dx]:
                            q.append([dy,dx])
                            visit[dy][dx] = 1
    print(result)