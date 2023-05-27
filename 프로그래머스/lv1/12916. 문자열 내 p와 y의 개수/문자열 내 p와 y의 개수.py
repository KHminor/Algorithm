def solution(s):
    answer, cntP, cntY = True, 0, 0
    for i in s:
        if i in ['p', 'P']:
            cntP += 1
        elif i in ['y', 'Y']:
            cntY += 1
    print(cntP, cntY)
    if cntP != cntY:
        answer = False    
    
    return answer