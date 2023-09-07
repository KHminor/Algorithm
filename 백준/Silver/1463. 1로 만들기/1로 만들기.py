from collections import deque
n = int(input())
li = [0]*(n+1)
q = deque([[n,0]])

while True:
    num,cnt = q.popleft()
    if num == 1: 
        print(cnt)
        break
    if not num%3 and not li[num//3]:
        li[num//3] = cnt+1 
        q.append([num//3,cnt+1])
    if not num%2 and not li[num//2]: 
        li[num//2] = cnt+1
        q.append([num//2,cnt+1])
    if not li[num-1]:
        li[num-1] = cnt+1 
        q.append([num-1,cnt+1])