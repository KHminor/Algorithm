def solution(keymap, targets):
    dic = dict()
    result = []
    for keys in keymap:
        for idx,key in enumerate(keys):
            if dic.get(key): dic[key] = min(dic.get(key),idx+1)
            else: dic[key] = idx+1
    for tg in targets:
        cnt = 0
        for i in tg:
            if dic.get(i): cnt += dic[i]
            else: 
                cnt = 0
                break
        if cnt == 0: result.append(-1) 
        else: result.append(cnt)
    return result