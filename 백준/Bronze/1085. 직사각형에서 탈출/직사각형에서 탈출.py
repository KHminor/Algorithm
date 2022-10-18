import sys
x,y,w,h = map(int,sys.stdin.readline().split())

si = sj = result = 0

li = []

li.append(x-si)
li.append(y-sj)
li.append(w-x)
li.append(h-y)

for i in li:
    if i < 0:
        i *= -1

print(min(li))