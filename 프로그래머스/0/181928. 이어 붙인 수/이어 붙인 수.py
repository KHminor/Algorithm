def solution(num_list):
    a,b = 0,0
    for i in num_list:
        if i%2: a = a*10+i
        else: b = b*10+i
    return a + b