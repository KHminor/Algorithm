import sys
input = sys.stdin.readline
n = int(input())
li = [list(map(int,input().split())) for _ in range(n)]
dp = [[0]*(i+1) for i in range(n)]
dp[0] = li[0]

for i in range(1,n):
    for j in range(i+1):
        if j == 0: dp[i][j] = dp[i-1][j] + li[i][j]
        elif j == i: dp[i][j] = dp[i-1][j-1] + li[i][j]
        else: dp[i][j] = max(dp[i-1][j] + li[i][j], dp[i-1][j-1] + li[i][j])
print(max(dp[n-1]))