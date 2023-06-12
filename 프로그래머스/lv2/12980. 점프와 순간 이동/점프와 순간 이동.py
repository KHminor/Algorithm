def solution(n):
    cnt = 1
    while n != 1:
        if n%2: cnt += 1
        n //= 2
    return cnt

