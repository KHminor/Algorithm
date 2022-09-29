def digital(i,m):
    global result
    if i == n:
        if m > result:
            result = m
            return
        else:
            return
    else:
        if result >= m:
            return
        else:
            for j in range(n):
                if not visited[j] and arr[i][j] != 0:
                    visited[j] = 1
                    un_m = m
                    m *= arr[i][j]*0.01

                    digital(i+1,m)
                    visited[j] = 0
                    m = un_m

T = int(input())
for tc in range(1,T+1):
    n = int(input())
    arr = [list(map(int,input().split())) for _ in range(n)]
    visited = [0]*n
    m = 1
    result = 0
    digital(0,m)
    result = format(result*100,'.6f')
    print(f'#{tc} {result}')
