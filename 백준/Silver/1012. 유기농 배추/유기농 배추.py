import sys
from collections import deque
from pprint import pprint
# 테스트케이스
t = int(sys.stdin.readline())

for _ in range(t):
    # 가로, 세로, 배추 개수
    m,n,k = map(int,sys.stdin.readline().split())

    # 재배장
    arr = [[0]*n for _ in range(m)]
    visited = [[0]*n for _ in range(m)]

    # 배추 심기
    for _ in range(k):
        i,j = map(int,sys.stdin.readline().split())
        arr[i][j] = 1

    # 배추흰지렁이 필요한 개수 찾기 (델타)
    cnt = 0
    # 상,하,좌,우
    di = [-1,1,0,0]
    dj = [0,0,-1,1]

    for a in range(m):
        for s in range(n):
            # 배추가 심어져있고, 방문하지 않은 곳일 경우
            if arr[a][s] == 1 and not visited[a][s]:
                # BFS
                q = deque([(a,s)])
                while q:
                    # q 사용
                    i,j = q.popleft()
                    # 해당 좌표가 방문한 곳일 경우 다시 q에서 뽑아 조사
                    if visited[i][j]:
                        continue
                    visited[i][j] = 1
                    # 델타 탐색
                    for x in range(4):
                        # 재배장 범위 안에 있어야하고, 이동 위치에 배추가 있어야하고, 해당 위치가 방문하지 않은 곳일 경우
                        if 0 <= i+di[x] < m and 0 <= j+dj[x] < n and arr[i+di[x]][j+dj[x]] and not visited[i+di[x]][j+dj[x]]:
                            q.append((i+di[x],j+dj[x]))
                cnt += 1

    print(cnt)
