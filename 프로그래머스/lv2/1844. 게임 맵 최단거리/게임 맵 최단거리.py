from collections import deque

def solution(maps):
    que, mx_X_ln, mx_Y_ln = deque([[0, 0, 1]]), len(maps[0])-1, len(maps)-1
    visit = [[0]*(mx_X_ln+1) for _ in range(mx_Y_ln+1)]

    while que:
        y, x, cnt = que.popleft()
        if visit[y][x]: continue 
        visit[y][x] = 1
        if x == mx_X_ln and y == mx_Y_ln: 
            return cnt
        
        for search in [[-1,0], [0,1], [1, 0], [0,-1]]:
            ny, nx = y+search[0], x+search[1] 
            if 0 <= nx <= mx_X_ln and 0 <= ny <= mx_Y_ln and maps[ny][nx] and not visit[ny][nx]:
                que.append([ny, nx, cnt+1])
            
    return -1 