import sys
input = sys.stdin.readline

r,c = map(int,input().split())
mtx = [list(input().rstrip('\n')) for _ in range(r)]

li = [0,0,0,0,0]
for i in range(r-1):
    for j in range(c-1):
        b,x = 0,0
        for k in range(2):
            for p in range(2):
                if mtx[i+k][j+p] == "#": b += 1
                elif mtx[i+k][j+p] == "X": x += 1
        if b: continue
        else: li[x] += 1

[print(i) for i in li]