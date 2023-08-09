a,b = input(), input()
ln_a, ln_b = len(a), len(b)
dp = [0]*ln_b
for i in range(ln_a):
    cnt = 0
    for j in range(ln_b):
        if dp[j] > cnt: cnt = dp[j]
        elif a[i] == b[j]: dp[j] = cnt + 1
print(max(dp))