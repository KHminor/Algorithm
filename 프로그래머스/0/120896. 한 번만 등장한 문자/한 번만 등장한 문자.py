from collections import Counter
def solution(s):
    result = []
    dic = Counter(s)
    for i in dic.keys():
        if dic[i] == 1: result.append(i)
    return "".join(sorted(result))