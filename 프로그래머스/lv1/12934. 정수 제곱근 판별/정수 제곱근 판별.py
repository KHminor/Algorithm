import math
def solution(n):
    answer = (math.sqrt(n)+1)**2
    if answer % math.ceil(answer):
        answer = -1
    else:
        math.floor(answer)
    return answer