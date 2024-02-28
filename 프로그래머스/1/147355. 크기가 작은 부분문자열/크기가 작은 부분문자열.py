def solution(t, p):
    result,p_ln = 0, len(p)
    for i in range(len(t)-p_ln+1):
        if int(p) >= int("".join(t[i:i+p_ln])): result += 1
    return result