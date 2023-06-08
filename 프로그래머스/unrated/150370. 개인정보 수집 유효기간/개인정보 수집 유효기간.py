from datetime import datetime

def solution(today, terms, privacies):
    year, month, day = map(int,today.split('.'))
    dic = {i.split(' ')[0]: int(i.split(' ')[1]) for i in terms}
    result = []
    for idx, i in enumerate(privacies):
        full_year, tm = i.split(' ')
        y, m, d = map(int,full_year.split('.'))
        if (year*12*28+month*28+day)-(y*12*28+(dic[tm]+m)*28+d) >= 0: result.append(idx+1)
    return result