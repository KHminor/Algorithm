def solution(n):
    result = [1]
    for i in range(2,11):
        if result[-1]*i <= n: result.append(result[-1]*i)
        else: return i-1
    return 10