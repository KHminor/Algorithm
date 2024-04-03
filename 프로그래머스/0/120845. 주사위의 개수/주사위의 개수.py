import math
def solution(box, n):
    return math.prod([i//n for i in box])