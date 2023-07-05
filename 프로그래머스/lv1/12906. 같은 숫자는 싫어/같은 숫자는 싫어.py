def solution(arr):
    li = []
    for i in range(len(arr)):
        if i != len(arr)-1: 
            if arr[i] != arr[i+1]: li.append(arr[i])
        else:li.append(arr[i])
    return li