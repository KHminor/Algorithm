n = int(input())
seat = input()

result,check = 2,0
for i in range(n-1):
    if seat[i] == 'L':
        if check == 1: 
            result += 1
            check = 0
        else: check += 1
    else: result += 1

if result > n: print(n)
else: print(result)