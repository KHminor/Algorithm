import sys
input = sys.stdin.readline
n,m,c = map(int,input().split())
arr = [list(map(int,input().rstrip('\n').split())) for _ in range(n)]

for i in range(min(n,m)//2):
    for _ in range(c):
        stack = [[i,i]]
        ch, tmp = 0, 0
        while ch != 2:
            y,x = stack.pop()
            if (y,x) == (i,i): 
                ch += 1
                if ch == 2: 
                    arr[y][x],tmp = tmp, arr[y][x]
                    break

            arr[y][x],tmp = tmp, arr[y][x] # 값 변경
            
            # 좌측 상단에서 좌측 하단 전까지
            if x == i and i<=y<n-1-i: stack.append([y+1,x])
            # 좌측 하단에서 우측 하단 전까지
            elif i<=x<m-i-1 and y == n-i-1: stack.append([y,x+1])
            # 우측 하단에서 우측 상단 전까지
            elif x == m-i-1 and i<y<=n-1-i: stack.append([y-1,x])
            else: stack.append([y,x-1])
[print(*i) for i in arr]