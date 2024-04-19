a,b = [],[]
for _ in range(3):
    x,y = map(int,input().split())
    a.append(x)
    b.append(y)

for i in set(a):
    if a.count(i) == 1: print(i, end=" ")
for i in set(b):
    if b.count(i) == 1: print(i)