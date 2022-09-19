visited = [[0]*101 for _ in range(101)]
cnt = 0
for _ in range(4):
    si,sj,ei,ej = map(int,input().split())
    x,y = ei-si, ej-sj
    for i in range(x):
        for j in range(y):
            if visited[si+i][sj+j] == 1:
                continue
            else:
                visited[si+i][sj+j] = 1
                cnt += 1
print(cnt)