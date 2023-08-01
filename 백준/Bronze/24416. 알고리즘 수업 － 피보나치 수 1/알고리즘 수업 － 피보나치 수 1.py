def fib(n):
    if dp[n]: 
        return dp[n] 
    else: 
        x = fib(n-1)+ fib(n-2)
        dp[n] = x 
        return x

n = int(input())
dp = [0]*(n+1)
dp[1] = dp[2] = 1
fib(n)
print(dp[n], n-2)