def solution(k, m, score):
    result,cnt = 0,0
    for i in sorted(score,reverse=True):
        cnt += 1
        if cnt == m: 
            result += i*m
            cnt = 0 
    return result