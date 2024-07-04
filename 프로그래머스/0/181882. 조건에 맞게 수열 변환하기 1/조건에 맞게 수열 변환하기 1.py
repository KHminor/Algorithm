def solution(arr):
    for i in range(len(arr)):
        if arr[i]>=50 and not arr[i]%2: arr[i] = arr[i]//2
        elif arr[i]<50 and arr[i]%2: arr[i] = arr[i]*2
    return arr