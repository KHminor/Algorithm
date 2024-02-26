def solution(participant, completion):
    dic = {i:0 for i in set(participant)}
    for i in participant: dic[i] += 1
    for i in completion: dic[i] -= 1
    for i in dic.keys():
        if dic[i] != 0: return i