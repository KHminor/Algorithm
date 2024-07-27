def solution(s):
    answer, li = True, []
    for i in s:
        if i == '(': li.append(i)
        else:
            if len(li): li.pop()
            else:
                answer = False 
                break
    if len(li): answer = False
    return answer