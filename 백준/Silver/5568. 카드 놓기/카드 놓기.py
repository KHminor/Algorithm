from itertools import permutations
n,k = int(input()),int(input())
li = [str(input()) for _ in range(n)]
result = set()
for i in list(permutations(li, k)):
    val = ''
    for j in i: val += j
    result.add(val)
print(len(result))