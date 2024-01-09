from itertools import permutations
li = list(input().split(":"))
result = []
for i in permutations(li):
    x = list(i)
    h,m,s = int(x[0]),int(x[1]),int(x[2])
    if 0<h<=12 and 0<=m<=59 and 0<=s<=59: result.append([x[0],x[1],x[2]])
print(len(result))