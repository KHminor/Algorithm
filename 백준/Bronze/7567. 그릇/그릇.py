li = list(input())
result = 10
for i in range(1,len(li)):
    if li[i] == li[i-1]: result += 5
    else: result += 10
print(result)