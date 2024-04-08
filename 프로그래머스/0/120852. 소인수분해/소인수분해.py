def solution(n):
    cnt = 2
    result = set()
    while n >= cnt:
        if not n%cnt:
            n = n//cnt
            if cnt not in result: result.add(cnt)
        else: cnt += 1
            
    return sorted(list(result))