import sys
input = sys.stdin.readline
n,m = map(int,input().split())
no_listen = set([input().rstrip('\n') for _ in range(n)])
no_show = set([input().rstrip('\n') for _ in range(m)])
result = sorted(no_listen.intersection(no_show))
print(len(result))
[print(i) for i in result]