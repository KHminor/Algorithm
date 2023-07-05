def solution(arr):
    li = []
    [li.append(i) for i in arr if li[-1:] != [i]]
    return li