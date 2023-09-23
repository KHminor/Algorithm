import math
n = str(math.factorial(int(input())))
for i in range(len(n)-1,-1,-1):
    if n[i] != '0':
        print(n[i])
        break