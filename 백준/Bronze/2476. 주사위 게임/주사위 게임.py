from collections import Counter
result = 0
for _ in range(int(input())):
    dic = Counter(list(map(int,input().split())))
    li = list(dic.keys())
    if len(li) == 1: result = max(result, 10000+li[0]*1000)
    elif len(li) == 2: 
        for i in li:
            if dic[i] == 2: result = max(result, 1000+i*100)
    else: result = max(result, max(li)*100)
print(result)