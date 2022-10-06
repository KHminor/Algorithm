while True:
    li = sorted(list(map(int,input().split())))
    if not li[0] and not li[1] and not li[2]:
        break
    big = li[-1]**2
    small = li[0]**2+li[1]**2

    if big == small:
        print('right')
    elif big != small:
        print('wrong')
    else:
        break
