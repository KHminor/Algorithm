import sys
from collections import Counter

n = int(input())
num = map(int, input().split())
n2 = int(input())
num2 = map(int, input().split())
c = Counter(num)

for i in num2:
    print(c[i], end= ' ')
