import sys
from collections import deque

input = sys.stdin.readline
cnt = 0
n,m = map(int,input().split())
dq = deque(range(1,n+1))

for i in list(map(int,input().split())):
    while True:
        if i == dq[0]: 
            dq.popleft()
            break
        else:
            if dq.index(i) < len(dq)/2:
                while dq[0] != i:
                    cnt += 1
                    dq.rotate(-1)
            else:
                while dq[0] != i:
                    cnt += 1
                    dq.rotate(1)
print(cnt)