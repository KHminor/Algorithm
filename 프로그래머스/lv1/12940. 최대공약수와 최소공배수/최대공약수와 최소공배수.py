def gcd(n,m):
    while m != False:
        n,m = m, n%m    
    return n

def lcm(n,m,x):
    return n*m//x

def solution(n, m):
    x = gcd(n,m) 
    return [x,lcm(n,m,x)]