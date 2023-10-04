import sys
input = sys.stdin.readline
n = [str(i) for i in sorted(list(map(int,input().rstrip('\n'))),reverse=True)]
if '0' in n:
    result = ''
    for i in n: result += i 
    print(-1) if int(result)%30 else print(int(result)) 
else: print(-1)