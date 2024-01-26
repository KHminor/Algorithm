import sys
input = sys.stdin.readline

n,k = map(int,input().split())
li = list(map(int,input().split()))

mx = -100*n
for i in range(n-k+1):
    val = sum(li[i:i+k])
    if val > mx: mx = val
print(mx)