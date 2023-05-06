for _ in range(int(input())):
    go = 0
    cnt = 0
    for i in input():
        if i == 'O': 
            go += 1
            cnt += go
        else: go = 0
    print(cnt)