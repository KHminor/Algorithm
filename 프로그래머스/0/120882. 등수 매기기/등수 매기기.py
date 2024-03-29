def solution(score):
    li = [sum(i)/2 for i in score]
    s_li = sorted(li,reverse=True)
    
    return [s_li.index(i)+1 for i in li ]