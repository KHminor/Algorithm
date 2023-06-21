def solution(n, left, right):
    result = []
    for i in range(left, right+1):
        x, y = i//n, i%n
        if x >= y: result.append(x+1)
        else: result.append(y+1)    
    return result