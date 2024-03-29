def solution(n):
    result = 0
    for i in range(1,n+1):
        result += 1
        while (True): 
            if not result%3 or "3" in set(str(result)): result += 1
            else: break
    return result

print(solution(40))