import sys
input = sys.stdin.readline

dic = dict()
mx = 1
for _ in range(int(input())):
    x = input().rstrip('\n')
    if dic.get(x) == None: dic[x] = 1
    else: 
        dic[x] += 1
        if dic[x] > mx: mx = dic[x]

result = []
for i in dic.keys():
    if dic[i] == mx: result.append(i)

print(sorted(result)[0])