x = input()
x_ln = len(x)

result = []
for i in range(x_ln-2):
    for j in range(i+1, x_ln-1):
        for z in range(j+1,x_ln):
            s = x[:i+1][::-1]+x[i+1:j+1][::-1]+x[j+1:][::-1]
            result.append(s)

print(sorted(result)[0])