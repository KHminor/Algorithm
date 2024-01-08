import sys
input = sys.stdin.readline
n,q = map(int,input().split())

n_li, x = [], 0

for i in range(n):
    z = int(input())
    n_li.append(z + x -1)
    x += z

for _ in range(q):
    Q = int(input())
    result = 0
    for i in range(n):
        if Q > n_li[i]: continue
        else: 
            print(i+1)
            break