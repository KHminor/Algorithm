import sys
input = sys.stdin.readline

mtx = [[0]*100 for _ in range(100)]

result = 0
for _ in range(int(input())):
    x,y = map(int,input().split())
    for i in range(y, y+10):
        for j in range(x,x+10):
            if not mtx[i][j]:
                mtx[i][j] = 1
                result += 1

print(result)