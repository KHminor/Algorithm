import sys
input = sys.stdin.readline
n = int(input())
li = list(map(int,input().split()))
k = int(input())

idx = n//k
for i in range(0, n, idx): print(*sorted(li[i:i+idx]), end=' ')