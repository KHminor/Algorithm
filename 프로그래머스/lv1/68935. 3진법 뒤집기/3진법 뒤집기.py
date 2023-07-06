def solution(n):
    li, result = [], 0
    while n != 0:
        li = li + [n%3]
        n = n//3
    li.reverse()
    for i in range(len(li)): result += (3**(i))*li[i]
    return result