li = list(map(int,input().split()))

while True:
    x = li
    for i in range(1,5):
        if x[i-1] > x[i]: 
            x[i-1],x[i] = x[i],x[i-1]
            print(*x)
    if " ".join([str(j) for j in x]) == "1 2 3 4 5": break