import sys
input = sys.stdin.readline

n,m = map(int,input().split())
mtx = [list(input().rstrip('\n')) for _ in range(n)]
cnt1 = 0
cnt2 = 0
for i in range(n):
    state = False
    for j in range(m):
        if mtx[i][j] == "X":
            state = True
    if not state: cnt1 += 1

for i in range(m):
    state = False
    for j in range(n):
        if mtx[j][i] == "X":
            state = True
    if not state: cnt2 += 1
print(max(cnt1,cnt2))