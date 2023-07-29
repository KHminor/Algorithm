n = int(input())
li = [ i if i == 1 else 0 for i in range(n+1)]
for i in range(2, n+1):
    li[i] = li[i-2] + li[i-1]
print(li[-1])