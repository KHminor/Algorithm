import sys
input = sys.stdin.readline

for _ in range(int(input())): print(len(set(input().rstrip('\n'))))