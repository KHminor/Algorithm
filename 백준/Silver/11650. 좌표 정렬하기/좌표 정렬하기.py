import sys
n = int(input())
li = [[0] for _ in range(n)]
for i in range(n):
    a,b = map(int,sys.stdin.readline().split())
    li[i] = [a,b]
li.sort()
for i in li:
    print(*i)
