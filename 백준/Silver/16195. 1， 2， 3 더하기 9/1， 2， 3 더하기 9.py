def startSetting():
    li[1][1] = 1
    
    li[2][1] = 1
    li[2][2] = 1
    
    li[3][1] = 1
    li[3][2] = 2
    li[3][3] = 1


import sys
input = sys.stdin.readline
val = 1000000009
li = [[0]*1001 for _ in range(1001)]
startSetting()
for i in range(4,1001):
    for j in range(1,i+1): li[i][j] = (li[i-1][j-1]+li[i-2][j-1]+li[i-3][j-1])%val

for _ in range(int(input())):
    n,m = map(int,input().split())
    print(sum(li[n][:m+1])%val)