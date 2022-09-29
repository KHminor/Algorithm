n = int(input())
result = 0
re_li = []
for i in range(1,n+1):
    cnt = 0
    if len(str(i)) <= 2: result += 1
    else:
        li = list(str(i))
        for j in range(1,len(li)):
            li[j-1] = int(li[j-1])-int(li[j])
        for x in range(1,len(li)-1):
            if li[x-1] == li[x]:
                cnt += 1
        if cnt == len(li)-2:
            result += 1
print(result)