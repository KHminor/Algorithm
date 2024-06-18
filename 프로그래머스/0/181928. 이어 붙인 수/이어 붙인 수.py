def solution(num_list):
    a,b = [],[]
    for i in num_list:
        if i%2: a.append(str(i))
        else: b.append(str(i))
    return int("".join(a)) + int("".join(b))