n = int(input())
cnt = ch_num = a = b = 0
ch = 1 

while True:
    cnt += 1
    if not ch_num+1 <= n <= ch_num+cnt:
        ch_num += cnt
        if ch == 1:
            ch = 2
        else:
            ch = 1
    elif ch_num+1 <= n <= ch_num+cnt:
        if ch == 1:
            for i in range(1,cnt+1):
                ch_num += 1
                a,b = cnt+1-i,i
                if ch_num == n: break
        else:
            for i in range(1,cnt+1):
                ch_num += 1
                b,a = cnt+1-i,i
                if ch_num == n: break
        break
print(str(a)+'/'+str(b))
