import sys
from collections import deque
input = sys.stdin.readline

n = int(input())
li = list(input().rstrip('\n'))
visit = [0]*n
result = 0

for i in range(n):
    if not visit[i]:
        q = deque([i])
        visit[i] = 1
        while q:
            s = q.popleft()
            if li[s] == 'E' and not visit[s+1]:
                visit[s+1] = 1
                q.append(s+1)
            elif li[s] == 'W' and not visit[s-1]:
                visit[s-1] = 1
                q.append(s-1)
        if li[i] != li[i-1]:
            result += 1
print(result)