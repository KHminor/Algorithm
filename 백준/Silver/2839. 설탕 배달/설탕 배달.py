import sys
n = int(sys.stdin.readline())

status = False
rr = n//15
result = rr * 3
n = n%15
if n == 0:
    print(result)
else:
    rnd = 1
    while rr != -1:
        x = 0
        for i in range(2*rnd,-1,-1):
            x = n+(15*(rnd-1))
            for j in range(4*rnd,-1,-1):
                if x == (i*5)+(j*3):
                    status = True
                    break

            if status == True:
                break
        if status == True:
            break
        else:
            rr -= 1
            rnd += 1

    if not i+j+result or not i+j:
        print(-1)
    else:
        print((rr*3)+i+j)
