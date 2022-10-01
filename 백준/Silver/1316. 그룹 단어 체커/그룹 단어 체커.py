n = int(input())
result = 0
for _ in range(n):
    st = input()
    li = []
    check = True
    for i in st:
        if i not in li:
            li.append(i)
        else:
            if i == li[-1]: continue
            else:
                check = False
                break
    if check: result += 1
print(result)