n = int(input())
a, b = 1, 3
if n == 1: print(1)
elif n == 2: print(3)
else:
    for _ in range(2, n): a, b = (b)%10007, (a*2+b)%10007
    print(b)