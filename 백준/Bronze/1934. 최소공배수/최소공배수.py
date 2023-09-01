import sys
input = sys.stdin.readline

for _ in range(int(input())):
    a,b = map(int,input().rstrip('\n').split())
    result = a*b
    if b>a: a,b = b,a
    while b != 0:
        a,b = b, a%b
    print(result//a)