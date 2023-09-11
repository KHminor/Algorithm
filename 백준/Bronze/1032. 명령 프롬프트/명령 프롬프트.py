import sys
input = sys.stdin.readline

li = []
for i in range(int(input())):
    if i == 0: li = list(input().rstrip('\n'))
    else:
        ch = list(input().rstrip('\n'))
        for j in range(len(li)):
            if li[j] != ch[j] and li[j] != '?':
                li[j] = '?'
[print(i,end='') for i in li]