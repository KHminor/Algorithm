import sys
input = sys.stdin.readline
n = int(input())
li = list(map(int,input().rstrip('\n').split()))
for _ in range(int(input())):
    gender, switch = map(int,input().split())
    if gender == 1:
        for i in range(1,n+1):
            if not i%switch:
                if li[i-1]: li[i-1] = 0
                else: li[i-1] = 1
    else:
        cnt = 0
        switch -= 1
        while True:
            if 0<=switch-cnt<n and 0<=switch+cnt<n and li[switch-cnt] == li[switch+cnt]:
                if li[switch-cnt]: li[switch-cnt],li[switch+cnt] = 0,0
                else: li[switch-cnt],li[switch+cnt] = 1,1
                cnt += 1
            else: break
for i in range((n//20)+1): print(*li[i*20:(i+1)*20])