import sys
input = sys.stdin.readline

while True:
    n,m = map(int,input().split())
    if (n,m) != (0,0):
        cnt = 0
        li = [int(input()) for _ in range(n)] # 1 2 3
        for _ in range(m):
            find = int(input()) # 1 2 4
            s,e = 0,n-1
            while e>=s:
                mid = (s+e)//2
                if li[mid] == find: 
                    cnt += 1
                    break
                elif li[mid] > find: e = mid-1
                else: s = mid+1
        print(cnt)
    else: break