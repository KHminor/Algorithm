import sys
from math import factorial
input = sys.stdin.readline
for _ in range(int(input())):
    n,m = map(int,input().split())
    print(int(factorial(m)/(factorial(m-n)*factorial(n))))