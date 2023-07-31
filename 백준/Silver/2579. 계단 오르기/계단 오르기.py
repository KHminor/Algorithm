import sys
input = sys.stdin.readline
n = int(input())
stairs = [int(input()) for _ in range(n)]
if n <= 2:
    print(sum(stairs))
else:
    dp = [stairs[0]]+[stairs[0]+stairs[1]]+[0]*(n-2)
    for i in range(2, n):
        dp[i] = max(stairs[i]+stairs[i-1]+dp[i-3], stairs[i]+dp[i-2])
    print(dp[-1])