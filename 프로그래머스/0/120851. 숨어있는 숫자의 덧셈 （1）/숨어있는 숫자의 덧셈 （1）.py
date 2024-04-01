def solution(my_string):
    s = set(str(i) for i in range(1,1001))
    return sum([int(i) for i in my_string if i in s])