from math import prod
def solution(clothes):
    dic = {}
    for i in clothes:
        try: dic[i[1]] += 1
        except: dic[i[1]] = 1
    li = [i+1 for i in list(dic.values())]
    return prod(li)-1