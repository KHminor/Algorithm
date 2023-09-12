import sys
from collections import deque

input = sys.stdin.readline
n = int(input())
mtx = [list(map(int,input().rstrip('\n').split())) for _ in range(n)]
visit = [[0]*n for _ in range(n)]
visit[0][0] = 1
q = deque([[0,0]])
flag = False

while q:
    i,j = q.popleft()
    val = mtx[i][j]
    for di,dy in [[i+val,j],[i,j+val]]:
        if 0<=di<n and 0<=dy<n and not visit[di][dy]:
            if (di,dy) == (n-1,n-1):
                flag = True
                break
            visit[di][dy] = 1
            q.append([di,dy])
    if flag: break

print('HaruHaru') if flag else print('Hing')