li = list(map(int,input().split()))
ad = ds = result = 0
for i in range(1,len(li)):
    if li[i-1]+1 == li[i] :
        ad += 1
    elif li[i-1]-1 == li[i]:
        ds += 1
    if ad > 0 and ds > 0:
        break
if len(li)-1 == ad:
    result = 'ascending'
elif len(li)-1 == ds:
    result = 'descending'
else:
    result = 'mixed'
print(result)