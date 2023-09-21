import sys
input = sys.stdin.readline
n = int(input())
if n%2:
    [print("1 2", end=' ') for _ in range(n//2)]
    print(3)
else: [print("1 2", end=' ') for _ in range(n//2)]