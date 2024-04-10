def solution(num, k):
    x = str(num).find(str(k))
    return -1 if x == -1 else x + 1