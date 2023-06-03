def solution(n):
    n_bin_cnt = bin(n).count('1')
    for i in range(n+1, 1000001):
        if n_bin_cnt == bin(i).count('1'): return i