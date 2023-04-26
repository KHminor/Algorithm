for _ in range(int(input())):
    a, b = input().split()
    a = int(a)
    for i in b:
        print(a*i, end='')
    print()
