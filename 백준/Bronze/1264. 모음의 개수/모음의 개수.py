import sys
input = sys.stdin.readline

while True:
    li = ['a', 'e', 'i', 'o', 'u']
    cnt = 0
    ip = list(input().rstrip('\n').lower())
    if ip == ['#']: break
    for i in ip:
        if i in li: cnt += 1
    print(cnt)