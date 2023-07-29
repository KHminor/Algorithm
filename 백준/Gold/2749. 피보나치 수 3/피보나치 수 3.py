a,b = 0,1
m, p = 1000000, 1500000
for _ in range((int(input())+1)%p):
    a, b = (a+b)%m, a%m
print(b)