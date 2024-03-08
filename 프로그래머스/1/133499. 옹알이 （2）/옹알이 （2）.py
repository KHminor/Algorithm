def solution(babbling):
    result = 0
    baby = ["aya", "ye", "woo", "ma"]
    for bab in babbling:
        s,state,text,bf = 0,False,"",""

        while True:
            check = False
            for word in baby:
                if bab[s:s+2] == word or bab[s:s+3] ==  word:
                    if bf == word:
                        state = True
                        break
                    check = True
                    bf = word
                    text += word
                    s += len(word)

            if not check or state: break

        if bab == text: result += 1
    return result 