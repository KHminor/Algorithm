def solution(n):
    return sum(list(range(n+1))[1::2]) if n%2 else sum([i**2 for i in list(range(n+1))[::2]])