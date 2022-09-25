n = int(input())

li = [0,1,2]

for i in range(n+1):
    if i <=2:
        continue
    else:
        li.append(li[i-2]+li[i-1])

if n <=2:
    print(li[n]%10007)
else:
    print(li[-1]%10007)
