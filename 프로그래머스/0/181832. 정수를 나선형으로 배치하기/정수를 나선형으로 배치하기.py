def solution(n):
    mtx = [[0]*n for _ in range(n)]
    i,vi,j,vj = 0,n-1,0,n-1
    
    s = 1
    r = 0
    while s <= n*n:
        while j <= vj and mtx[i][j] == 0:
            mtx[i][j] = s
            s += 1
            j += 1
        i,j = i+1,j-1 

        while i <= vi and mtx[i][j] == 0:
            mtx[i][j] = s
            s += 1
            i += 1
        i,j = i-1,j-1

        while j >= r and mtx[i][j] == 0:
            mtx[i][j] = s
            s += 1
            j -= 1
        i,j = i-1,j+1

        while j >= r and mtx[i][j] == 0:
            mtx[i][j] = s
            s += 1
            i -= 1
        i,j = i+1,j+1

        vi,vj = vi-1,vj-1
        r += 1
    return mtx