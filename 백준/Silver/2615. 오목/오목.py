import sys
input = sys.stdin.readline
mtx = [list(map(int,input().rstrip('\n').split())) for _ in range(19)]
result,r_mtx,flag = 0,(0,0),False

for i in range(19):
    for j in range(19):
        if mtx[i][j]:
            li = []
            for dy,dx in [[-1,1],[0,1],[1,1],[1,0]]: # 방향 찾기
                if 0<=i+dy<19 and 0<=j+dx<19 and mtx[i+dy][j+dx] == mtx[i][j]:
                    if 0<=i-dy<19 and 0<=j-dx<19:
                        if mtx[i-dy][j-dx] != mtx[i][j]: li.append([dy,dx])
                    else:li.append([dy,dx])
            for dy,dx in li:
                y,x,cnt = dy+i,dx+j,1
                while 0<=y<19 and 0<=x<19 and mtx[y][x] == mtx[i][j]:
                    y,x,cnt = y+dy,x+dx,cnt+1
                if cnt == 5: 
                    print(mtx[i][j])
                    print(i+1,j+1)
                    sys.exit(0)

print(0)