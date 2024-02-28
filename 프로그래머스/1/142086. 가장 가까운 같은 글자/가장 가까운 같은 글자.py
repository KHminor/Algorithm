def solution(s):
    result = []
    dic = {i:-1 for i in set(s)}
    for i in range(len(s)):
        if dic.get(s[i]) != -1: result.append(i-dic[s[i]])
        else: result.append(-1)
        dic[s[i]] = i
    return result