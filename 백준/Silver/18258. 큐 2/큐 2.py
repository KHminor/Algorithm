def check(_inVal):
    if _inVal[0] == 'push': q.append(_inVal[1])
    elif _inVal[0] == 'pop':
        if len(q): print(q.popleft())
        else: print(-1)
    elif _inVal[0] == 'size': print(len(q))
    elif _inVal[0] == 'empty':
        if len(q): print(0)
        else: print(1)
    elif _inVal[0] == 'front':
        if len(q): print(q[0])
        else: print(-1)
    elif _inVal[0] == 'back':
        if len(q): print(q[-1])
        else: print(-1)
    return

import sys
from collections import deque
input = sys.stdin.readline
q = deque([])
for _ in range(int(input())):
    _inVal = input().rstrip('\n').split()
    check(_inVal)  