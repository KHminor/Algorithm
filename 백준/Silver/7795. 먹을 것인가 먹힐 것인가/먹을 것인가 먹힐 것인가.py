import sys
inpyt = sys.stdin.readline

for _ in range(int(input())):
    n,m = map(int,input().split())
    n_li,m_li = sorted(list(map(int,input().rstrip('\n').split()))),sorted(list(map(int,input().rstrip('\n').split())))
    result = 0
    for i in n_li:
        s,e = 0,m-1
        mid = 0
        while e>=s:
            mid = (s+e)//2
            if i > m_li[mid]: s = mid+1
            else: e = mid-1
        if mid == 0 and i > m_li[0]: result += 1
        elif mid != 0: result += min(s,e)+1
    print(result)