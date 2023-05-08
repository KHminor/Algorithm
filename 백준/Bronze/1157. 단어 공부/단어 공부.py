st = input().upper()
li = {i:0 for i in set(st)}
for i in st: li[i] += 1
result = []
for i in li:
    if li[i] == max(li.values()): result = result + [i]
if len(result) > 1: print('?')
else: print(result[-1])