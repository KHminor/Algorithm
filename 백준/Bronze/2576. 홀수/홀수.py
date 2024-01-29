li = sorted([int(input()) for _ in range(7)])

hap,num = -1,-1
for i in li:
    if i%2:
        if num == -1: num = i
        hap += i
if hap == -1: print(-1)
else:
    print(hap+1)
    print(num)