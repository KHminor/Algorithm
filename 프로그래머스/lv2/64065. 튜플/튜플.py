import re

def solution(s):
    answer = []
    a = re.findall(r'\{.*?\}', s[1:-1])
    a.sort(key=len)
    a = [set(map(int,i.strip('{}').split(','))) for i in a]
    if len(a) == 1: answer =  list(a[0])
    else:
        for i in range(len(a)-1):
            if i == 0: answer.append(list(a[i])[0])
            answer.append(list(a[i+1].difference(a[i]))[0])
    return answer