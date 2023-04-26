num = int(input())
if  (not num % 4 and num % 100) or (not num % 4 and not num % 400):
    print(1)
else :
    print(0)