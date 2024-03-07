def solution(n):
    result = [2]
    for i in range(3,n+1):
        state = True
        rng = round(i**(1/2))
        for j in range(2,rng+1):
            if not i%j:
                state = False
                break
        if state: result.append(i)
    return len(result)