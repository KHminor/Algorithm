import sys
input = sys.stdin.readline

n = int(input())
li = list(map(int,input().split()))
result = [0]*n

for i in range(n):
    cnt = 0
    for j in range(n):
        if cnt == li[i] and result[j] == 0:
            result[j] = i+1
            break
        elif not result[j]: cnt += 1

print(*result)