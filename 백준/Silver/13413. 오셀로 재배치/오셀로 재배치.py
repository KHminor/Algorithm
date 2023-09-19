import sys
input = sys.stdin.readline

for _ in range(int(input())):
    n = int(input())
    before,after = input().rstrip('\n'),input().rstrip('\n')
    w_cnt,b_cnt = 0,0
    result = 0

    for i in range(n):
        if before[i] != after[i]:
            if before[i] == "W": w_cnt += 1
            else: b_cnt += 1

    if b_cnt > w_cnt: w_cnt,b_cnt = b_cnt,w_cnt
    print(w_cnt)