def solution(my_string):
    result = []
    check = set()
    for i in my_string:
        if i not in check: 
            result.append(i)
            check.add(i)
    return "".join(result)