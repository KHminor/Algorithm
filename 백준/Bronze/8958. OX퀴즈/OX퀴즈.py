for _ in range(int(input())):
    li = []
    cnt = 0
    for i in input():
        if i == 'O':
            cnt += 1
            li = li + [cnt]
        else:
            cnt = 0
    print(sum(li))