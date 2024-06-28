def solution(arr, n):
    return [arr[i]+n if not i%2 else arr[i] for i in range(len(arr)) ] if len(arr)%2 else [arr[i]+n if i%2 else arr[i] for i in range(len(arr))]