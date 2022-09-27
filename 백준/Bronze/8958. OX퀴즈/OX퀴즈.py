import sys
T = int(input())
for _ in range(T):
    li = list(sys.stdin.readline())[:-1]
    ch_li = [0]*len(li)
    cnt = 0
    for i in range(len(li)):
        if li[i] == 'O':
            cnt += 1
        else:
            cnt = 0
        ch_li[i] = cnt
    print(sum(ch_li))