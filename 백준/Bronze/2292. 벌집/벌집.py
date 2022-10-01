n = int(input())
i = 2
result = 0
li = [0,1]
while True:
    if n == 1:
        result = 1
        break
    else:
        li.append(li[i-1]+ 6*(i-1))

        if n <= li[i]:
            result = 1+(i-1)
            break
        i += 1
print(result)