n = int(input())
for i in range(2*n):
    if i<n: print(i*" " + (n-i-1)*"*" + "*" + (n-i-1)*"*")
    elif i == n: continue
    else: print((2*n-i-1)*" " + (i-n)*"*" + "*" + (i-n)*"*")