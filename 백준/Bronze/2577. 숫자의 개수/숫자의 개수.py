import math
li = math.prod([int(input()) for _ in range(3)])
dic = {i:0 for i in range(10)}
for i in str(li):
    dic[int(i)] += 1
for i in range(10):
    print(dic[i])