def solution(n, words):
    me_num, me_cnt, flag, f_word = 0, 0, False, ''
    dic = {i:0 for i in set(words)}
    for i in range(len(words)//n):
        for j in range(n):
            if f_word == '': 
                f_word = words[n*i+j][-1]
                dic[words[n*i+j]] += 1
            elif words[n*i+j][0] == f_word:
                if dic[words[n*i+j]]: 
                    me_num, me_cnt, flag = j+1, i+1, True
                    break
                f_word = words[n*i+j][-1]
                dic[words[n*i+j]] += 1
            else:
                me_num, me_cnt, flag = j+1, i+1, True
                break
        if flag: break       
    return [me_num, me_cnt]

