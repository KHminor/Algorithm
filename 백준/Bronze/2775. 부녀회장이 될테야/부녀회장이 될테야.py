import sys
T = int(sys.stdin.readline())
for _ in range(T):
    k = int(sys.stdin.readline())
    n = int(sys.stdin.readline())

    arr = [[0]*(n+1) for _ in range(k+1)]
    for i in range(n+1):
        arr[0][i] = i

    for i in range(1,k):
        for j in range(1,n+1):
            for x in range(j):
                arr[i][j] += arr[i-1][j-x]

    print(sum(arr[k-1][:n+1]))