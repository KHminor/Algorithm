import sys
input = sys.stdin.readline

k = int(input())
st = input().rstrip('\n')
ln_st = len(st)
mtx = [[""]*k for _ in range(ln_st//k)]

for i in range(k):
    for j in range(ln_st//k):
        mtx[j][i] = st[i+(j*k)]

for i in range(ln_st//k):
    if i%2: mtx[i].reverse()


for i in range(k):
    for j in range(ln_st//k):
        print(mtx[j][i],end="")