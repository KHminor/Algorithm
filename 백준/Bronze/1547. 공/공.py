import sys
input = sys.stdin.readline

li = [0,1,0,0]
for _ in range(int(input())):
    x,y = map(int,input().split())
    li[x],li[y] = li[y],li[x]
print(li.index(1))