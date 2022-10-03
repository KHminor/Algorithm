import sys
n = int(input())
li = [[0] for _ in range(n)]
for i in range(n):
    a,b = map(int,sys.stdin.readline().split())
    li[i] = [a,b]
li.sort(key=lambda x:x[0])
li.sort(key=lambda x:x[1])
for i in li:
    print(*i)