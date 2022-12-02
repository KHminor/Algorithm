n, cntn = map(int,input().split())

li = sorted([int(input()) for _ in range(n)])
max_ch_num = li[-1]
min_ch_num = 1
cnt = result = 0
ch_num = li[-1]
while min_ch_num<max_ch_num:
    for i in range(n):
        cnt += li[i]//ch_num
    if cntn <= cnt:
        min_ch_num = ch_num
    else:
        max_ch_num = ch_num-1
    ch_num = (min_ch_num + max_ch_num) // 2 +1
    cnt = 0

print(min_ch_num)