def solution(a, b, c, d):
    dic = {}
    result = 0
    for i in [a,b,c,d]:
        if dic.get(i): dic[i] += 1
        else: dic[i] = 1
    dic_values = list(dic.values())
    dic_keys = list(dic.keys()) 
    if len(dic_values) == 1: result = dic_keys[0]*1111
    elif len(dic_values) == 2: 
        if max(dic_values) == 3: 
            p_idx = dic_values.index(3)
            p_val = dic_keys.pop(p_idx)
            result = (10*p_val+dic_keys[0])**2
        else: result = (dic_keys[0]+dic_keys[1])*abs(dic_keys[0]-dic_keys[1])
    elif len(dic_values) == 3: 
        idx = dic_values.index(2) 
        dic_keys.pop(idx)
        result = dic_keys[0]*dic_keys[1]
    else: result = min(dic_keys)
    return result