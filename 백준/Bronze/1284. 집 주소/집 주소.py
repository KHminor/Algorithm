import sys
input = sys.stdin.readline

while True:
    n = input().rstrip('\n')
    cnt = 0
    if n == '0': break
    else: 
        for i in n:
            if i == '1': cnt += 2
            elif i == '0': cnt += 4
            else: cnt += 3
        print(cnt + len(n)-1 + 2)