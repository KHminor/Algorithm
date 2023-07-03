def solution(arr1, arr2):
    ln1, ln2 = len(arr1), len(arr1[0])
    li = [[0 for i in range(ln2)] for i in range(ln1)]
    for i in range(ln1):
        for j in range(ln2):
            li[i][j] = arr1[i][j] + arr2[i][j]
    return li