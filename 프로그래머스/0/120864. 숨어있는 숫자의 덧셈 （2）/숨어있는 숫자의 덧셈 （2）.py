def solution(my_string):
    result,num = 0,[]
    li = {str(i) for i in range(10)}
    for i in my_string:
        if i in li: num.append(i)
        elif num != []: 
            result += int("".join(num))
            num.clear()
    if num != []: result += int("".join(num))
    return result