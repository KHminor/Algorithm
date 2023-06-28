def solution(arr): 
    if len(arr) > 2: 
        del arr[arr.index(min(arr))]
        return arr
    else: return [-1]