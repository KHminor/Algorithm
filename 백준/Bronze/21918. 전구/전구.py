import sys
input = sys.stdin.readline

n,m = map(int,input().split())
li = list(map(int,input().split()))

for _ in range(m):
    x,y,z = map(int,input().split())
    if x == 1: li[y-1] = z
    else: 
        for j in range(y-1,z): 
            if x == 2: li[j] = 1 if li[j] == 0 else 0
            elif x == 3: li[j] = 0 
            elif x == 4: li[j] = 1

print(*li)