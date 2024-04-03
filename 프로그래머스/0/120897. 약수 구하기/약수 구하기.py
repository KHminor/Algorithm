def solution(n):
    result = []
    for i in range(1,int(n**(0.5))+1):
        if not n%i:
            if i != n//i: result.append(n//i)
            result.append(i)
    return sorted(result)