import sys
def mid_order(n):
    global cnt
    if n >= len(ch_li):
        return
    else:
        mid_order(2*n)
        ch_li[n] = li[cnt]
        cnt +=1
        mid_order(2*n+1)

k = int(sys.stdin.readline())

li = list(map(int,sys.stdin.readline().split()))
ch_li = [0]*(2**k)
cnt = 0

mid_order(1)
for i in range(k):
    print(*ch_li[2**i:2**(i+1)])