import re

def solution(s):
    answer = []
    li = re.findall(r'\{.*?\}', s[1:-1])
    li.sort(key=len)
    li = [set(map(int,i.strip('{}').split(','))) for i in li]
    if len(li) == 1: answer =  list(li[0])
    else:
        for i in range(len(li)-1):
            if i == 0: answer.append(list(li[i])[0])
            answer.append(list(li[i+1].difference(li[i]))[0])
    return answer