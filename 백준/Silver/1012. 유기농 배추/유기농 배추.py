import sys
from pprint import pprint
from collections import deque
# 테스트케이스
t = int(sys.stdin.readline())

for _ in range(t):
    # 가로, 세로, 배추 개수
    m,n,k = map(int,sys.stdin.readline().split())

    # 재배장
    arr = [[0]*m for _ in range(n)]
    visited = [[0]*m for _ in range(n)]

    # 배추 심기
    for _ in range(k):
        i,j = map(int,sys.stdin.readline().split())
        arr[j][i] = 1

    # 배추흰지렁이 필요한 개수 찾기 (델타)
    cnt = 0
    # 상,하,좌,우
    di = [-1,1,0,0]
    dj = [0,0,-1,1]

    for i in range(n):
        for j in range(m):
            # 배추가 심어져있고, 방문하지 않은 곳일 경우
            if arr[i][j] == 1 and not visited[i][j]:
                # BFS
                q = deque([(i,j)])
                while q:
                    # q 사용
                    a,s = q.popleft()
                    # 해당 좌표가 방문한 곳일 경우 다시 q에서 뽑아 조사
                    if visited[a][s]:
                        continue
                    visited[a][s] = 1
                    # 델타 탐색
                    for x in range(4):
                        # 재배장 범위 안에 있어야하고, 이동 위치에 배추가 있어야하고, 해당 위치가 방문하지 않은 곳일 경우
                        if 0 <= a+di[x] < n and 0 <= s+dj[x] < m and arr[a+di[x]][s+dj[x]] and not visited[a+di[x]][s+dj[x]]:
                            q.append((a+di[x],s+dj[x]))

                cnt += 1

    print(cnt)