T = int(input())
for tc in range(1,T+1):
    n = int(input())
    li = list(map(int,input().split()))

    while len(li) != 2:
        ln = len(li)
        if ln%2:   # 홀수
            for i in range(ln//2+1):
                if i != (ln//2):
                    li[i] = li[i]+li[ln-i-1]
                else:
                    li[i] += li[i]
            li = li[:ln//2+1]
        else:           # 짝수
            for i in range(ln//2):
                li[i] = li[i] + li[ln-i-1]
            li = li[:ln//2]

    if li[0]>li[1]:
        print(f'Case #{tc}: Alice')
    else:
        print(f'Case #{tc}: Bob')