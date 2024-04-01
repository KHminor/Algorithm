import math
def solution(n):
    return 1 if math.sqrt(n)%int(math.sqrt(n)) == 0 else 2