n,p = map(int,input().split())
now = n
li = []
while True:
    now = (now*n)%p
    if now not in li: li.append(now)
    else:
        check = now
        for i in range(len(li)):
            if check == li[i]: 
                print(len(li[i:]))
                break
        break