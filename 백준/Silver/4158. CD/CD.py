import sys
input = sys.stdin.readline

while True:
    n,m = map(int,input().split())
    if (n,m) != (0,0):
        _n,_m = set(),set()
        for _ in range(n): _n.add(int(input()))
        for _ in range(m): _m.add(int(input()))
        print(len(_n.intersection(_m)))
    else: break