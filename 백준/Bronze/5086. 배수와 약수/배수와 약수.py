import sys
input = sys.stdin.readline

while True:
    state = True
    a,b = map(int,input().split())
    if (a,b) == (0,0): break
    if b > a: 
        state = False
        a,b = b,a
    
    a_set = set()
    for i in range(1,a//2+1):
        if not a%i: 
            a_set.add(i)
            a_set.add(a//i)
    if b in a_set:
        if state: print("multiple")
        else: print("factor")
    else: print("neither")
