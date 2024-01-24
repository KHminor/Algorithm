import sys
from itertools import combinations
input = sys.stdin.readline

n = int(input())
li = [[input().rstrip() for _ in range(5)] for _ in range(n)]

# [p1,p2,val]
result = [-1,-2,36]

for i in list(combinations(range(n),2)):
    x,y = i[0],i[1]
    diff = 0
    for j in range(5):
        for k in range(7):
            if li[x][j][k] != li[y][j][k]: diff += 1
    if result[-1] > diff: result = [x+1,y+1,diff]

print(result[0],result[1])