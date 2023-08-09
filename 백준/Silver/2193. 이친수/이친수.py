n = int(input())
a, b = 1, 1
for _ in range(2, n): a, b = b, a+b
print(b)