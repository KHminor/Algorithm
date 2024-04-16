for _ in range(int(input())):
    result,mx = "",-1
    for _ in range(int(input())):
        a,b = input().split()
        if int(b) > mx: result,mx = a,int(b)
    print(result)