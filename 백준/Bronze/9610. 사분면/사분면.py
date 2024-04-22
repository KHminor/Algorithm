import sys
input = sys.stdin.readline

a,b,c,d,axis = 0,0,0,0,0
for _ in range(int(input())):
    x,y = map(int,input().split())
    if x == 0 or y == 0: axis += 1
    elif x>0 and y>0: a += 1
    elif x<0 and y>0: b += 1
    elif x<0 and y<0: c += 1
    else: d += 1
print("Q1: %d"%a)
print("Q2: %d"%b)
print("Q3: %d"%c)
print("Q4: %d"%d)
print("AXIS: %d"%axis)