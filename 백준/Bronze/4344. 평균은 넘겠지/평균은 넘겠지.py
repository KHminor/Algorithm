import sys
T = int(sys.stdin.readline())
for _ in range(T):
    li = list(map(int,sys.stdin.readline().split()))
    n,li = li[0],li[1:]
    mid_num = sum(li)/n
    cnt = 0
    for i in li:
        if i > mid_num:
            cnt +=1

    result = format((cnt/n)*100, '.3f')
    print(str(result)+'%')