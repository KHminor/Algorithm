def d(n):
    num_li = list(map(int,str(n)))
    num = sum(num_li)+n
    return num

result = [i for i in range(1,10000)]
for i in range(1,10000):
    num = d(i)
    if num in result:
        result.remove(num)

for x in result:
    print(x)