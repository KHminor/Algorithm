def solution(quiz):
    result = []
    for i in quiz:
        li = i.replace("=","").split()
        if li[1] == "+" and int(li[0])+int(li[2]) == int(li[-1]): result.append("O")
        elif li[1] == "-" and int(li[0])-int(li[2]) == int(li[-1]): result.append("O")
        else: result.append("X")
            
    return result