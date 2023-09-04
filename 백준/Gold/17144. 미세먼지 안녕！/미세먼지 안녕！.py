# 먼지 확산 -> 공기청정기 순환
# 공기 청정기의 경우 가에 있는 '테두리 영역'만 순환
import sys
import copy
from pprint import pprint
input = sys.stdin.readline

def Diffusion(h,w,val):
    global r,c,tc
    find = []
    for a,b in [[-1,0],[1,0],[0,-1],[0,1]]:
        dy,dx = a+h,b+w
        if 0<=dy<r and 0<=dx<c and arr[dy][dx] != -1:
            find.append([dy,dx])
    tmp = val//5
    for dy,dx in find: visited[dy][dx] += tmp
    visited[h][w] += val-(tmp*len(find))
    return

r,c,t = map(int,input().split())
arr = [list(map(int,input().rstrip('\n').split())) for _ in range(r)]

air = []
for tc in range(t):
    visited = [[0]*c for _ in range(r)]
    # 우선 먼지 확산 + 공기청정기 위치 찾기
    for i in range(r):
        for j in range(c):
            if arr[i][j]:
                if not tc and arr[i][j] == -1: air.append([i,j])
                elif arr[i][j] != -1:
                    Diffusion(i,j,arr[i][j])
    s_top = [[air[0][0],air[0][1]+1,0]]
    while s_top:
        y,x,tmp = s_top.pop() # 현재 위치 
        now, visited[y][x] = visited[y][x], tmp
        if x == c-1: # 가로 마지막 칸의 경우
            if y == 0: # 현재 높이가 가장 위의 경우
                s_top.append([y,x-1,now])
            else: 
                s_top.append([y-1,x,now])
        elif x == 0: # 가로 첫번째 칸의 경우
            if y+1 != air[0][0]: # 현재 높이가 가장 아래가 아닐 경우, 즉 공기청정기의 위치가 아닐 때
                s_top.append([y+1,x,now]) 
        else:
            if y == 0: # 양 끝이 아니고, 높이가 가장 위의 경우
                s_top.append([y,x-1,now])
            else:
                s_top.append([y,x+1,now])

    s_bottom = [[air[1][0],air[1][1]+1,0]]
    while s_bottom:
        y,x,tmp = s_bottom.pop() # 현재 위치  
        now, visited[y][x] = visited[y][x], tmp
        if x == c-1: # 가로 마지막 칸의 경우
            if y == r-1: # 현재 높이가 가장 아래의 경우
                s_bottom.append([y,x-1,now])
            else: 
                s_bottom.append([y+1,x,now])
        elif x == 0: # 가로 첫번째 칸의 경우
            if y-1 != air[1][0]: # 현재 높이가 가장 위가 아닐 경우, 즉 공기청정기의 위치가 아닐 때
                s_bottom.append([y-1,x,now]) 
        else:
            if y == r-1: # 양 끝이 아니고, 높이가 가장 아래의 경우
                s_bottom.append([y,x-1,now])
            else:
                s_bottom.append([y,x+1,now])
    arr = copy.deepcopy(visited)
    for a,b in air:
        arr[a][b] = -1
print(sum([sum(i) for i in visited]))