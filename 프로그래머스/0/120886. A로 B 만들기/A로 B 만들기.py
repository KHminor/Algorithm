from collections import Counter
def solution(before, after):
    a,b = Counter(before),Counter(after)
    result = 1
    for i in set(after):
        if a.get(i) != b.get(i): result = 0
    return result
    