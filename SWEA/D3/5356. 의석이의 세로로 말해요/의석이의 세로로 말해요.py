T = int(input())
for tc in range(1,T+1):
    arr = [list(input()) for _ in range(5)]
    s = ''
    for i in range(16):
        for j in range(5):
            if len(arr[j]) <= i:
                continue
            s += arr[j][i]
    print(f'#{tc} {s}')