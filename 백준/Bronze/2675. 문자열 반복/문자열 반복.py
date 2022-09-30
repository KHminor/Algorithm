T = int(input())
for _ in range(T):
    cnt,s = input().split()
    cnt = int(cnt)
    s = list(s)
    result = ''

    for i in s:
        result += i*cnt

    print(result)