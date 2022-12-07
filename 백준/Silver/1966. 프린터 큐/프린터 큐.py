import sys
from collections import deque
t = int(sys.stdin.readline())
for _ in range(t):
    n,m = map(int,sys.stdin.readline().split())
    li = list(map(int,sys.stdin.readline().split()))
    q = deque()
    for i,x in enumerate(li):
        q.append((i,x))
    li.sort()
    cnt = 0
    while q:
        i,x = q.popleft()
        if x == li[-1]:
            cnt += 1
            li.pop()
            if i == m:
                print(cnt)
                break
        else:
            q.append((i,x))