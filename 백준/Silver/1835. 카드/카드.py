from collections import deque

n = int(input())
cnt = n
li = [i for i in range(1,n+1)]
li.reverse()

result = deque([])

for i in li:
    result.appendleft(i)
    for _ in range(cnt): result.rotate(1)
    cnt -= 1
print(*result)