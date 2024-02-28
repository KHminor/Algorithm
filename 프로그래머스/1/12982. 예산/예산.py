def solution(d, budget):
    result = 0
    d.sort()
    for i in d:
        if budget - i >= 0:
            result += 1
            budget -= i
        else: break
    return result