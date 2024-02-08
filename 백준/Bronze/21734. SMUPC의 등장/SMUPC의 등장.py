for i in input():
    st = ord(i)
    while st != 0:
        print(i*(st%10),end="")
        st //= 10
    print()