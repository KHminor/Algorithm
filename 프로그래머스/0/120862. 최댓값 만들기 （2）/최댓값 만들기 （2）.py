from itertools import combinations
import math
def solution(numbers):
    return max([math.prod(i) for i in list(combinations(numbers,2))])