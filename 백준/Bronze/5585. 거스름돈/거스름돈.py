n = 1000-int(input())
result = 0
for i in [500,100,50,10,5,1]:
    a,n = divmod(n,i)
    result += a
print(result)