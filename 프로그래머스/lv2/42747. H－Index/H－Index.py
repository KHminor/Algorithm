def solution(citations):
    h, c_ln, result = 0, len(citations), 0
    for i in range(1, c_ln+1):
        ln = len([j for j in citations if j >= i])
        if not (ln >= i): break
        elif ln >= i: result = i 
    return result
