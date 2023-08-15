from collections import deque
n,k = map(int,input().split())
visit = [0]*100001
visit[n] = 1
q = deque([[n,0]])

while q:
    s,cnt = q.popleft()
    if s == k:
        print(cnt)
        break
    for ds in [s+1, s-1, s*2]:
        if 0<=ds<=100000 and not visit[ds]:
            visit[ds] = 1
            q.append([ds,cnt+1])