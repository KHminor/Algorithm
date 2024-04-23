import sys
input = sys.stdin.readline
n = int(input())
print(*sorted(list(set(map(int,input().split())))))