def solution(array, n):
    li = sorted(set(array))
    for i in range(len(li)-1):
        if abs(li[i+1]-n) >= abs(li[i]-n): return li[i]
    return li[-1]