import sys
n,m = map(int,sys.stdin.readline().split())
li = sorted(list(map(int,sys.stdin.readline().split())))
li.reverse()

sm = 1
bg = li[0]
while sm <= bg:
    cnt = 0
    mid = (sm+bg) //2

    for i in li:
        if i >= mid:
            cnt += i - mid


    if cnt >= m:
        sm = mid+1
    else:
        bg = mid-1

print(bg)