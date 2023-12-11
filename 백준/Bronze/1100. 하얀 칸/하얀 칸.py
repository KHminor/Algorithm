import sys
input = sys.stdin.readline
cnt = 0

for i in range(8):
    li = list(input())
    for j in range(8):
        if not i%2 and not j%2 and li[j] == "F": cnt += 1
        elif i%2 and j%2 and li[j] == "F": cnt += 1
print(cnt)