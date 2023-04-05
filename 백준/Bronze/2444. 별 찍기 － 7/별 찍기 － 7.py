n = int(input())

li = []
for i in range(n-1,-1,-1):
    li.append((' '*i)+(n-i)*'*'+((n-i-1)*'*'))

for i in range(n):
    print(li[i])
for i in range(n-2,-1,-1):
    print(li[i])