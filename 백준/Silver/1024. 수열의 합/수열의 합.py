import sys
N,L = map(int,input().split())

state = False
for l in range(L, 101):
    lx = N - (l*(l+1)//2)
    if not lx % l:
        x = lx//l
        if x + 1 >= 0: 
            print(*(i for i in range(x+1, x+l+1)))
            sys.exit(0)

if not state: print(-1)