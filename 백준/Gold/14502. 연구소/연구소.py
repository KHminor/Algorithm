import sys
from collections import deque
from copy import deepcopy 
input = sys.stdin.readline
n,m = map(int,input().split())
arr = [ list(map(int,input().split())) for i in range(n)]
virus_q = deque([])
result = 0
for i in range(n):
    for j in range(m):
        if arr[i][j] == 2: # 바이러스 위치 찾기
            virus_q.append([i,j])

def bfs():
    global result
    check_arr = deepcopy(arr)
    q = deepcopy(virus_q)
    cnt = 0
    while q:
        x,y = q.popleft()
        for i in [[-1,0], [1, 0], [0, -1], [0, 1]]:
            dx, dy = x + i[0], y + i[1]
            if 0 <= dx < n and 0 <= dy < m and check_arr[dx][dy] == 0:
                check_arr[dx][dy] = 2
                q.append([dx, dy])
    for i in range(n):
        for j in range(m):
            if check_arr[i][j] == 0:
                cnt += 1
    result = max(result, cnt)
    return

def make_wall(cnt):
    if cnt == 3:
        bfs()
        return
    for i in range(n):
        for j in range(m):
            if arr[i][j] == 0:
                arr[i][j] = 1
                make_wall(cnt+1)
                arr[i][j] = 0
make_wall(0)
print(result)