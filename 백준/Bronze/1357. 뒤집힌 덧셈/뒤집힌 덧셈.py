def Rev(num):
    return num[::-1]

x,y = input().split()
print(int(Rev(str(int(Rev(x))+int(Rev(y))))))