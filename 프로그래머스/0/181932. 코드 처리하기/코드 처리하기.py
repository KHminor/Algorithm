def solution(code):
    result = []
    mode = 0
    for i,c in enumerate(code):
        if c == "1": mode = 1 if mode == 0 else 0
        elif not i%2 and mode == 0: result.append(c)
        elif i%2 and mode == 1: result.append(c) 

    return "EMPTY" if result == [] else "".join(result)