def solution(left, right):
    result = 0
    for i in range(left, right+1):
        cnt = 0
        for j in range(1, int(i**(1/2))+1):
            if not i%j: 
                if i//j == j: cnt += 1
                else: cnt += 2
        if cnt%2: result -= i
        else: result += i 
    return result