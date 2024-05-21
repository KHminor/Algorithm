import sys
input = sys.stdin.readline

for _ in range(int(input())):
    print(sorted(map(int,input().split()))[-3])