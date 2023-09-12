import sys
input = sys.stdin.readline

n,k = map(int,input().split())
li = list(map(int,input().rstrip('\n').split()))
ch = li + li[::-1]
rg = 0
for i in range(len(ch)):
    if rg<=k<rg+ch[i]:
        print(n*2-i) if i>=n else print(i%n+1)
        break
    rg += ch[i]