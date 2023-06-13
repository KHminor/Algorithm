def solution(k, tangerine):
    dic, cnt = {}, 0
    for i in tangerine:
        try: dic[i] += 1
        except: dic[i] = 1
    dic = sorted(dic.items(), key=lambda x:x[1], reverse=True)
    for i in range(len(dic)):
        k -= dic[i][1]
        cnt += 1
        if k <= 0: break
    return cnt