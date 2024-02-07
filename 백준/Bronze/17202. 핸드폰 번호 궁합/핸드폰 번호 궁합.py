a,b = list(map(int,input())),list(map(int,input()))

while True:
    now_a,now_b = [],[]
    a_cnt,b_cnt = 0,0
    while True:
        try:
            if a_cnt == b_cnt:
                now_a.append((a[a_cnt]+b[b_cnt])%10)
                a_cnt += 1
            else:
                now_b.append((a[a_cnt]+b[b_cnt])%10)
                b_cnt += 1

        except: break
    a,b = now_a,now_b
    if len(now_a) == 1:
        break

print(str(a[0])+str(b[0]))