import sys

def re(st,l,r,cnt):
    if l >= r: return (1,cnt)
    elif st[l] != st[r]: return (0,cnt)
    return re(st,l+1,r-1,cnt+1)

def ispalin(st):
    return re(st, 0, len(st)-1,1)


n = int(sys.stdin.readline())
for _ in range(n):
    s = sys.stdin.readline().rstrip('\n')
    print(*ispalin(s))