n = int(input())
num = 2
result = []
while n >= num:
    if not n%num: 
        n //= num
        result.append(num)
    else: num += 1
[print(i) for i in result]