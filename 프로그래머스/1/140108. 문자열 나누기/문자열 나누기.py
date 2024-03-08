def solution(s):
    x,cnt = "",0
    li = [0,0]
    for i in range(len(s)):
        if x == "":
            li[0] += 1
            x = s[i]
        elif x == s[i]: li[0] += 1
        elif x != s[i]: li[1] += 1
        
        if li[0] == li[1]:
            cnt += 1
            x = ""
            li = [0,0]
    if li != [0,0]: cnt += 1
    return cnt