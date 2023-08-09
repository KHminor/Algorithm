n = int(input())
a, b = 1, 2
for _ in range(2, n): a, b = (b)%15746, (a+b)%15746
if n == 1: print(a)
else: print(b)