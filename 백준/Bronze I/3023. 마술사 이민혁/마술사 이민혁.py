import sys
input = sys.stdin.readline

r,c = map(int,input().split())
mtx = [[""]*(2*c) for _ in range(r*2)]
check = [list(input().rstrip('\n')) for _ in range(r)]
err = list(map(int,input().split()))

cnt = r-1
for i in range(2*r):
    if r > i: 
        li = check[i] + check[i][::-1]
        for j in range(2*c): mtx[i][j] = li[j]
    else: 
        li = mtx[cnt]
        for j in range(2*c): mtx[i][j] = li[j]
        cnt -= 1
mtx[err[0]-1][err[1]-1] = "#" if mtx[err[0]-1][err[1]-1] == "." else "."

for i in range(2*r): print("".join(mtx[i]))