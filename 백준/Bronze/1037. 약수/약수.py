import sys
input = sys.stdin.readline
cnt = int(input())
li = sorted(list(map(int,input().rstrip('\n').split())))
print(li[0]*li[-1])