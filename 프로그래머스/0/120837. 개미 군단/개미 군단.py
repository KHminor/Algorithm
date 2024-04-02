def solution(hp):
    result = 0
    for i in [5,3,1]:
        result += hp//i
        hp %= i
    return result