def solution(x):
    answer, hap, cuX = True, 0, x
    while x:
        hap += x%10
        x //=10
    if cuX%hap: answer= False
    return answer