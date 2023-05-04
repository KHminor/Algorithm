import sys
n,x = map(int,sys.stdin.readline().split())
for i in list(map(int,sys.stdin.readline().split())):
    if x > i:
        print(i, end=' ')