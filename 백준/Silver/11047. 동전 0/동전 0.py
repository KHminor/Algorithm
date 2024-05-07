import sys
input = sys.stdin.readline

n,k = map(int,input().split())
li = sorted([int(input()) for _ in range(n)],reverse=True)
result = 0

for i in li:
    if k >= i:
        a,k = divmod(k,i)
        result += a
print(result)