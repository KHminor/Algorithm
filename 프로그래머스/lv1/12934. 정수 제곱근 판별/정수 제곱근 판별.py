import math
def solution(n):
    answer = (math.sqrt(n)+1)**2
    if answer % 1:
        answer = -1
    else:
        math.floor(answer)
    return answer