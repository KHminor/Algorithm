import sys
n = int(sys.stdin.readline())
for _ in range(n):
    a, b = map(int, sys.stdin.readline().split())
    while True:
        if a == b:
            print(a * 10)
            break
        if a > b:
            a //= 2
        else:
            b //= 2