import sys
from math import factorial

n,k = map(int,sys.stdin.readline().split())
print(factorial(n)//(factorial(n-k)*factorial(k)))