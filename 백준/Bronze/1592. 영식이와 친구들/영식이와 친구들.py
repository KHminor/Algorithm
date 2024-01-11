n,m,l = map(int,input().split())

li = [0]*n
x, result = 0, 0
li[x] += 1

while li[x] < m:
    if li[x]%2: x = (x+l)%n
    else:   
        if x-l< 0: x = n+x-l
        else: x = x-l
    li[x] += 1
    result += 1
print(result)