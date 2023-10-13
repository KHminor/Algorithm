def solution(n):
    x,y = 1, 2 
    if n in [1,2]: return n % 1234567
    for i in range(n-2): x, y = y, x+y
    return y % 1234567