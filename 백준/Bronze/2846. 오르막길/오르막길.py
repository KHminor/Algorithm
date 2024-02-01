n = int(input())
li = list(map(int,input().split()))
start,result = li[0],0
for i in range(1,n):
    if li[i-1] >= li[i]:
        if start != li[i-1]: result = max(result, li[i-1]-start)
        start = li[i]
    elif i == n-1 and li[i] > li[i-1]:
        if start != li[i]: result = max(result,li[i]-start)
print(result)