import sys

n,m = map(int,sys.stdin.readline().split())
arr = [list(input()) for _ in range(n)]

a = b = n1 = n2 = 0
result = 2500

while (b+7) < n:
    while (a+7) < m:
        for i in range(8):
            for j in range(8):
                if not((b+i)+(a+j))%2:
                    if arr[b+i][a+j] != 'W':
                        n1 += 1
                    if arr[b+i][a+j] != 'B':
                        n2 += 1
                else:
                    if arr[b+i][a+j] != 'B':
                        n1 += 1
                    if arr[b+i][a+j] != 'W':
                        n2 += 1
        if result > n1:
            result = n1
        if result > n2:
            result = n2
        a += 1
        n1 = n2 = 0
    a = 0

    b += 1
print(result)
