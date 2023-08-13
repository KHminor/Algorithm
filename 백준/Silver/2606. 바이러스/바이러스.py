import sys
from collections import deque
input = sys.stdin.readline
com = int(input())
dic = {i:[] for i in range(1, com+1)}
visit = [0]*(com+1)
visit[1] = 1
result = 0
for _ in range(int(input())):
    s,e = map(int,input().split())
    dic[s].append(e)
    dic[e].append(s)

q = deque([1])

while q:
    s = q.popleft()
    for i in dic[s]:
        if not visit[i]:
            visit[i] = 1
            result +=1
            q.append(i)
print(result)