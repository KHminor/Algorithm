import sys
input = sys.stdin.readline

for _ in range(int(input())):
    a,b = map(int,input().rstrip('\n').split())
    c_a,c_b = a,b
    
    while c_a != c_b:
        if c_a > c_b: c_b += b
        else: c_a += a
    print(c_a)