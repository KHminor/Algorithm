for _ in range(3):
    mx,cnt,num = 0,0,""
    for i in input():
        if num == i: cnt += 1
        else: cnt,num = 1,i
        if cnt > mx: mx = cnt
    print(mx)