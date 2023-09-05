import sys
input = sys.stdin.readline
n = int(input())
jump = [list(map(int,input().rstrip('\n').split())) for _ in range(n-1)]

dp = [sys.maxsize]*n
dp[0] = 0
for i in range(n-1):
    if i+1<n: dp[i+1] = min(dp[i+1],dp[i]+jump[i][0])
    if i+2<n: dp[i+2] = min(dp[i+2],dp[i]+jump[i][1])

s_jump = int(input())
result = dp[-1]

for i in range(3,n):
    b_val, one, two = dp[i-3]+s_jump, sys.maxsize, sys.maxsize
    for j in range(i,n-1):
        if j+1<=n: one = min(one,b_val+jump[j][0])
        if j+2<=n: two = min(two,b_val+jump[j][1])
        b_val, one, two = one, two, sys.maxsize
    result = min(result, b_val)
print(result)