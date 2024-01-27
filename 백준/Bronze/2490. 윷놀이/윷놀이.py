import sys
input = sys.stdin.readline

for _ in range(3):
    o,t = 0,0
    for i in list(map(int,input().split())):
        if i == 0: o +=1
        else: t += 1
    if o == 4: print("D")
    elif t == 4: print("E")
    else: print(chr(64+o))