import sys
input = sys.stdin.readline

n,m = map(int,input().split())
mtx = [list(map(int,input().rstrip("\n"))) for _ in range(n)]

result = 0
for i in range(n):
    for j in range(m):
        for x in range(n-i):
            try:
                if mtx[i][j] == mtx[i][j+x] == mtx[i+x][j] == mtx[i+x][j+x]: result = max(result, (x+1)**2)
            except: break
print(result)