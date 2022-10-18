from _collections import deque
import sys

q = deque()

for _ in range(int(sys.stdin.readline())):
    li = list(sys.stdin.readline().split())

    if li[0] == 'push_front':
        q.appendleft(li[1])

    elif li[0] == 'push_back':
        q.append(li[1])

    elif li[0] == 'pop_front':
        if q:
            print(q.popleft())
        else:
            print(-1)

    elif li[0] == 'pop_back':
        if q:
            print(q.pop())
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