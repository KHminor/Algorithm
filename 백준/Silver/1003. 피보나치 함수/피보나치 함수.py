import sys

def fibo(n):
    if dic[n] != [0,0]:
        return dic[n]
    else:
        if n == 0:
            dic[0] = [1,0]
            return dic[0]
        elif n == 1:
            dic[1] = [0,1]
            return dic[1]
        else:
            c = fibo(n-2) + fibo(n-1)
            jjac = hol = 0
            for i in range(len(c)):
                if i % 2:
                    hol += c[i]
                else:
                    jjac += c[i]
            dic[n] = [jjac,hol]
            return dic[n]

t = int(sys.stdin.readline())
for _ in range(t):
    n = int(sys.stdin.readline())
    dic = {x:[0,0] for x in range(n+1)}
    c = fibo(n)
    print(*c)
