import sys
input = sys.stdin.readline

n,k = map(int,input().split())
li = [[0,0]]+[list(map(int,input().split())) for _ in range(n)]

dp = [[0]*(k+1) for _ in range(n+1)]

for i in range(1,n+1):
    weight, value = li[i]
    for j in range(1,k+1): dp[i][j] = dp[i-1][j] if j < weight else max(value+dp[i-1][j-weight], dp[i-1][j])
print(max(dp[n]))