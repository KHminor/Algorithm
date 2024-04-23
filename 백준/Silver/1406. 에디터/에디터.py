import sys
from collections import deque
input = sys.stdin.readline

l,r = deque(list(input().rstrip('\n'))),deque([])
for _ in range(int(input())):
    li = input().rstrip('\n').split()
    if li[0] == 'L' and len(l): r.appendleft(l.pop())
    elif li[0] == 'D' and len(r): l.append(r.popleft()) 
    elif li[0] == 'B' and len(l): l.pop()
    elif li[0] == 'P': l.append(li[1])
print(''.join(l+r))