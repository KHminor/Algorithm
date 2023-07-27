import sys 
from itertools import combinations
input = sys.stdin.readline
li = [int(input()) for _ in range(9)]
for i in list(combinations(li, 7)):
    if sum(i) == 100: 
        for j in sorted(list(i)):
            print(j)
        break