import sys
n, m = map(int, sys.stdin.readline().split())
li = [list(sys.stdin.readline().rstrip('\n')) for _ in range(n)]
fw_cnt = fb_cnt = 0
cnt = 2500
for i in range(n-7):
    for j in range(m-7):
        fw, fb = 'W', 'B'
        check_fw_cnt = check_fb_cnt = 0
        for y in range(8):
            check_li = li[i+y][j:j+8]
            for x in range(8):
                if fw == check_li[x]:
                    check_fw_cnt += 1
                if fb == check_li[x]:
                    check_fb_cnt += 1
                if x != 7:
                    if fw == 'W':
                        fw = 'B'
                    else:
                        fw = 'W'
                    if fb == 'W':
                        fb = 'B'
                    else:
                        fb = 'W'
        if cnt > min(check_fw_cnt, check_fb_cnt):
            cnt = min(check_fw_cnt, check_fb_cnt)
print(cnt)
