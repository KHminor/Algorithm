def nPr(s,m):
    if s == m:
        result.append(li[0:m])
    else:
        for i in range(s,n):
            li[s],li[i] =li[i],li[s]
            nPr(s+1,m)
            li[s], li[i] = li[i], li[s]

n,m = map(int,input().split())
li = [i for i in range(1,n+1)]
result = []
nPr(0,m)

result.sort()
for i in result:
    print(*i)