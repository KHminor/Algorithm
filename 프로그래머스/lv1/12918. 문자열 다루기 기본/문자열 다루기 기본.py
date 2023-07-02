def solution(s):
    n_li = [str(i) for i in range(0,10)]
    if not (len(s) == 4 or len(s) == 6): return False 
    for i in s:
        if i not in n_li: return False
    return True