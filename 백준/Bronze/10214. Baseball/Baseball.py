for _ in range(int(input())):
    a,b = 0,0
    for _ in range(9):
        i,j = map(int,input().split())
        a,b = a+i,b+j
    if a>b: print("Yonsei")
    elif b>a: print("Korea")
    else: print("Draw")