import sys
input = sys.stdin.readline
cnt = 0
while True:
    state = False
    cnt += 1
    o,w = map(int,input().split())
    if o == 0 and w == 0: break
    while True:
        x,y = input().rstrip('\n').split()
        y = int(y)
        if x == '#': break
        elif x == 'E': w -= y
        else: w += y
        if w <= 0: state = True
    
    if w <= 0 or state: print("%d RIP"%cnt)
    elif o//2 < w < o*2: print("%d :-)"%cnt)
    else:print("%d :-("%cnt)