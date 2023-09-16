import sys
input = sys.stdin.readline

n = int(input())
li = list(map(int,input().rstrip('\n').split()))
dp = [0]*n
dp[0] = 1

for i in range(1,n):
    for j in range(i): 
        if li[j] < li[i]: dp[i] = max(dp[i],dp[j])
    dp[i] += 1
print(max(dp))