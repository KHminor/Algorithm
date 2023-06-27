def solution(arr, divisor):
    li = [i for i in arr if i%divisor == 0]
    return sorted(li) if len(li) else [-1]