import sys
from itertools import combinations
input = sys.stdin.readline
n = int(input())
li = [int(input()) for _ in range(n)]
if n <= 2: print(sum(li))
else:
    dp = [0]*n
    dp[0], dp[1], dp[2] = li[0], li[0]+li[1], sum(max(combinations(li[:3],2)) )
    for i in range(3, n): dp[i] = max(li[i]+li[i-1]+dp[i-3], li[i]+li[i-1]+dp[i-4], li[i]+dp[i-2])
    print(max(dp))