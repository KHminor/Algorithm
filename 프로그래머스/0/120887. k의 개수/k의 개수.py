def solution(i, j, k):
    result = 0
    for x in range(i,j+1):
        while x != 0:
            if x%10 == k: result += 1
            x //= 10
    return result