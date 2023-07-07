def solution(s):
    result, s = '', list(s.split(" "))
    for i in range(len(s)):
        for j in range(len(s[i])):
            if not j%2: result+= s[i][j].upper()
            else: result += s[i][j].lower()
        if i != len(s)-1: result += ' ' 
    return result