def solution(n):
    result = 0
    for i in range(4, n+1):
        cnt = 0
        for j in range(1, int(i**0.5)+1):
            if not i%j:
                if i//j != j: cnt += 2
                else: cnt += 1
            if cnt >= 3:
                result += 1
                break
    return result