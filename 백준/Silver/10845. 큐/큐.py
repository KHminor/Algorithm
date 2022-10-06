from collections import deque
import sys
n = int(sys.stdin.readline())
q = deque()
for _ in range(n):
    li = list(sys.stdin.readline().split())

    if li[0] == 'push':
        q.append(li[1])

    elif li[0] == 'pop':
        if q:
            print(q.popleft())
        else:
            print(-1)

    elif li[0] == 'size':
        print(len(q))

    elif li[0] == 'empty':
        if q:
            print(0)
        else:
            print(1)

    elif li[0] == 'front':
        if q:
            print(q[0])
        else:
            print(-1)

    elif li[0] == 'back':
        if q:
            print(q[-1])
        else:
            print(-1)
