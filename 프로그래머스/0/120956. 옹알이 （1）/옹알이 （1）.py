def solution(babbling):
    answer = 0
    
    for i in range(len(babbling)):  
        b_ln = len(babbling[i]) 
        if b_ln < 2: continue
        word = {"aya", "ye", "woo", "ma"}
        s = 0 
        state = True 
        while b_ln > s: 
            if b_ln >= s+3 and babbling[i][s:s+3] in word: 
                print(babbling[i][s:s+3])
                word.remove(babbling[i][s:s+3])
                s += 3
            elif babbling[i][s:s+2] in word:  
                print(babbling[i][s:s+2])
                word.remove(babbling[i][s:s+2])
                s += 2
            else:
                state = False
                break
        if state:
            answer += 1
    return answer