import sys
from collections import deque
input = sys.stdin.readline
n = int(input())
arr = [list(map(int,input().strip('\n'))) for _ in range(n)]
visit = [[0]*n for _ in range(n)]
stack = deque([])
result = []
r_cnt = 0
for i in range(n):
    for j in range(n):
        if arr[i][j] and not visit[i][j]:
            cnt, r_cnt = 1, r_cnt + 1
            visit[i][j] = 1
            stack.append([i,j])
            while stack:
                x,y = stack.pop()
                for a,b in [[-1,0],[1,0],[0,-1],[0,1]]:
                    dx,dy = x+a, y+b
                    if 0<=dx<n and 0<=dy<n and arr[dx][dy] and not visit[dx][dy]:
                        cnt +=1
                        visit[dx][dy] = 1
                        stack.append([dx,dy])
            result.append(cnt)
print(r_cnt)
[print(i) for i in sorted(result)]