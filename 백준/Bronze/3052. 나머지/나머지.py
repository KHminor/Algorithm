li = []
for _ in range(10):
    num = int(input())%42
    if num not in li:
        li = li + [num]
print(len(li))