N = int(input())
re_li = []
for i in range(N-1, 0, -1):
    num = i
    sum = 0
    while i != 0:
        sum += i%10
        i = i//10

    result = num + sum
    if result == N:
        re_li.append(num)

if re_li:
    print(min(re_li))
else:
    print(0)