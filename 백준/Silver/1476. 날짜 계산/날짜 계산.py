import sys
input = sys.stdin.readline
e,s,m = map(int,input().split())
x,y,z = 0, 0, 0
result = 0

while True:
    x, y, z = x+1, y+1, z+1
    if x%16 == 0: x = 1
    if y%29 == 0: y = 1
    if z%20 == 0: z = 1
    result += 1
    if e==x and s==y and m==z: break
print(result)