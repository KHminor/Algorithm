n1,n2 = input().split()

n1 = list(n1)
n2 = list(n2)
n1.reverse()
n2.reverse()
result = [int(''.join(n1)),int(''.join(n2))]
print(max(result))