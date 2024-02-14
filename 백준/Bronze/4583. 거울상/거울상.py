import sys
input = sys.stdin.readline

mirror = {"b","d","p","q","i","o","v","w","x"}
dic = {"b":"d",
        "d":"b",
        "p":"q",
        "q":"p"
        }
while True:
    text = input().rstrip('\n')
    if text == "#": break
    t_ln = len(text)
    result = [""]*t_ln
    state = True
    for i in range(t_ln//2):
        back = t_ln-1-i
        if (text[i],text[back]) == ("b","d") or (text[i],text[back]) == ("p","q") : result[i],result[back] = text[i],text[back]
        elif text[i] in mirror and text[back] in mirror:
            if text[i] in {"b","d","p","q"} and text[back] in {"b","d","p","q"}: result[i],result[back] = dic[text[back]],dic[text[i]]
            elif text[i] in {"b","d","p","q"}: result[i],result[back] = text[back],dic[text[i]]
            elif text[back] in {"b","d","p","q"}:result[i],result[back] = dic[text[back]],text[i]
            else: result[i],result[back] = text[back],text[i]
        else: 
            state = False
            break
    
    if state: 
        if t_ln%2:
            if text[t_ln//2] not in mirror: print("INVALID")
            else:
                if text[t_ln//2] in {"b","d","p","q"}: result[t_ln//2] = dic[text[t_ln//2]]
                else: result[t_ln//2] = text[t_ln//2]
                print("".join(result))
        else: 
            print("".join(result))
    else: print("INVALID")