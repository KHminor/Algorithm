import sys
sys.setrecursionlimit(2000)
def findset(x):
    global cnt
    if x == arr[x] or ch_li[x] == 0:
        cnt += 1
        return
    else:
        ch_li[x] = 0
        return findset(arr[x])



T = int(input())
for _ in range(T):
    n = int(input())
    num_li = list(map(int,input().split()))
    arr = [0]*(n+1)
    cnt = 0
    for i in range(1,n+1):
        arr[i] = num_li[i-1]        # [0, 3, 2, 7, 8, 1, 4, 5, 6]

    ch_li = arr[:]

    x = 1
    while x < n+1:
        visited = [0]*(n+1)
        if not ch_li[x]:
            x += 1
            continue
        findset(x)
        x += 1
    print(cnt)