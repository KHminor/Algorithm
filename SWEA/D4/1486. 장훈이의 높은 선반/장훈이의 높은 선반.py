T = int(input())
for tc in range(1,T+1):
    N,B = map(int,input().split())
    arr = list(map(int,input().split()))
    n = len(arr)
    sum_li = []
    for i in range(1 << n):   
        li = []
        for j in range(n):     
            if i & (1 << j):
                li.append(arr[j])
        sum_li.append(sum(li)-B)
    s_li = sorted(sum_li)
    result = 0
    for j in range(len(s_li)-1,-1,-1):
        if s_li[j] < 0:
            break
        else:
            result = s_li[j]
    print(f'#{tc} {result}')