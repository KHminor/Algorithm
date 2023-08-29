import sys
input = sys.stdin.readline
n = int(input())
li = sorted([int(input()) for _ in range(n)], reverse=True)
result, cnt = 0, 1
for i in range(n):
    if li[i]*cnt > result: result = li[i]*cnt
    cnt += 1
print(result)