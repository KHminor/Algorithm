def solution(n):
    result = 1
    while 6*result%n: result += 1
    return result