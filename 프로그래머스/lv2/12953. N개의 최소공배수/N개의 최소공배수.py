def gcd(x,y):
    while y: x,y = y, x%y
    return x

def lcm(x,y): return (x*y)//gcd(x,y)

def solution(arr):
    result = 0
    for i in arr:
        if result == 0: result = i
        else: result = lcm(result, i)
    return result