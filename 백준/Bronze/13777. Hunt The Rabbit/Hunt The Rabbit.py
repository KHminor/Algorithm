import sys
input = sys.stdin.readline

while True:
    n = int(input())
    if not n: break
    s,e = 1,50

    while e >= s:
        mid = (s+e)//2
        if n == mid:
            print(mid)
            break
        else:
            print(mid, end=' ')
            if mid >= n: e = mid-1
            else: s = mid+1