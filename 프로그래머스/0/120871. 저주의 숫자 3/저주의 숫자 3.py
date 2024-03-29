def solution(n):
    result = 0
    for _ in range(n):
        result += 1
        while (not result%3 or "3" in set(str(result))): result += 1
    return result