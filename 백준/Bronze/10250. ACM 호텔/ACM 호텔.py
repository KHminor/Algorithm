T = int(input())

for _ in range(T):
    h,w,n = map(int,input().split())

    cnt = x = y = 1

    while cnt != n:
        if x == h:
            y += 1
            x = 1

        elif x < h:
            x += 1

        cnt += 1
    result = ''
    x,y = str(x),str(y)
    if len(y) == 2:
        print(x+y)
    else:
        print(x+str(0)+y)

