import sys
from itertools import combinations
input = sys.stdin.readline

n,m = map(int,input().split())
li = sorted(list(map(int,input().rstrip('\n').split())))
for i in sorted(list(set(combinations(li,m)))): print(*i)