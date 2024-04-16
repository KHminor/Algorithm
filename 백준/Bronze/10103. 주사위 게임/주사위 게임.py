a,b = 100,100
for _ in range(int(input())):
    i,j = map(int,input().split())
    if i>j: b -= i
    elif j>i: a -=j
print(a)
print(b)