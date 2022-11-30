import sys

def fibo(s,n):
    if n == 0:
        return 0
    elif s == n+1:
        return li[n]
    else:
        li.append(li[s - 2] + li[s - 1])
        return fibo(s+1,n)



li = [0,1]
num = int(sys.stdin.readline())
print(fibo(2,num))
