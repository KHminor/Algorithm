n = int(input())
for i in range(2, int(n**0.5)+1):
    while not n%i:
        n //= i
        print(i)
if n != 1: print(n)