li = list(map(int,input().split()))
result = 0
for i in range(len(li)):
    result += li[i]**2
result = result%10
print(result)