import sys
input = sys.stdin.readline

li = sorted([int(input()) for _ in range(int(input()))])
result = 0
for i in range(len(li)):
    for j in range(len(li)):
        cnt = 0
        for k in li:
            if 0<=li[j]-li[i]<=4 and li[i]<=k<=li[j]: cnt += 1
        if cnt > result: result = cnt
print(5-result)