import sys
from collections import deque
input = sys.stdin.readline

n = int(input())
li1 = [-1 for _ in range(n+1)]
li2 = [[] for _ in range(n+1)]
a,b = map(int,input().split())
v1,v2 = {a},{b}

for _ in range(int(input())):
    x,y = map(int,input().split())
    # 부모에서 자식으로 연결시키기
    li1[y] = x
    li2[x].append(y)

result = -1
for i in range(1,n+1):
    if li2[i]:
        hap = 0
        q = deque([[i,0]])
        # q = deque([[j,1] for j in li2[i]])
        s_a,s_b = False, False
        while q:
            num,cnt = q.popleft() # [2,0]
            if num == a:
                s_a = True
                hap += cnt
            elif num == b:
                s_b = True
                hap += cnt
            if s_a and s_b: break

            for j in li2[num]: q.append([j,cnt+1])
        if s_a and s_b:
            if result == -1: result = hap
            else: result = min(result, hap)

print(result)