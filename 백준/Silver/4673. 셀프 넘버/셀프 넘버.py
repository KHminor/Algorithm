result = [i for i in range(1, 10001)]
for i in range(1, 10001):
    hap = i + sum(list(map(int,str(i))))
    if hap in result: result.remove(hap)
for i in result: print(i)