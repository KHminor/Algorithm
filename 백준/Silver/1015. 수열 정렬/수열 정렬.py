import sys

input = sys.stdin.readline
n = int(input())
li = list(map(int,input().split()))
result = [-1]*n

for i in range(n):
    low = sys.maxsize
    idx = 0
    for j in range(n):
        if result[j] != -1: continue
        elif low > li[j]: 
            low = li[j]
            idx = j
    result[idx] = i
print(*result)