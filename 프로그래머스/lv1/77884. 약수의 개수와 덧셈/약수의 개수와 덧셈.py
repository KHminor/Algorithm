def solution(left, right):
    result = 0
    for i in range(left, right+1):
        if i//i**(1/2) == i**(1/2): result -= i
        else: result += i 
    return result