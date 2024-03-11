def solution(n, m, section):
    result = 0
    li = [0]*(n+1)
    for i in section:
        if not li[i]:
            try: 
                li[i:i+m] = [1]*m
                result += 1
            except: result += 1
    return result