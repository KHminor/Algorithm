def solution(n):
    answer, result = [i for i in str(n)], 0
    answer.sort(reverse=True)
    return int(''.join(answer))