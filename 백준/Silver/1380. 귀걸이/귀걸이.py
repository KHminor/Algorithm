import sys
input = sys.stdin.readline

tc = 1
while True:
    n = int(input())
    if not n: break

    name = [input().rstrip('\n') for _ in range(n)]
    cnt = [2 for _ in range(n)]

    for _ in range(2*n-1):
        idx, check = input().rstrip('\n').split()
        cnt[int(idx)-1] -= 1

    for i in range(n): 
        if cnt[i] == 1: 
            print(tc, name[i])
            break
    tc += 1