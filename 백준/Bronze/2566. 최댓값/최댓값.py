import sys
arr = [list(map(int,sys.stdin.readline().split())) for _ in range(9)]

maxi = maxj = max = 0
for i in range(9):
    for j in range(9):
        if arr[i][j] > max:
            maxi,maxj,max = i,j,arr[i][j]

print(max)
print(maxi+1,maxj+1)