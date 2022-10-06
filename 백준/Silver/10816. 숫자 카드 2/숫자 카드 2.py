import sys
n = int(sys.stdin.readline())

from collections import defaultdict

a = defaultdict(int)
for i in map(int,input().split()):
    a[i] += 1

m = int(input())
for i in map(int,input().split()):
    print(a[i],end=' ')