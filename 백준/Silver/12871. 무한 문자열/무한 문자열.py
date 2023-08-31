import sys
input = sys.stdin.readline

s, t = input().rstrip('\n'), input().rstrip('\n')
result = 0

if len(s)> len(t):
    tmp = s
    s = t
    t = tmp

if len(t)//len(s)*s == t or len(t)*s == len(s)*t: print(1)
else: print(0)