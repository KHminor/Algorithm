def solution(n):
    n_bin_cnt = bin(n).replace('0', '').lstrip('0b').count('1')
    for i in range(n+1, 1000001):
        if n_bin_cnt == bin(i).replace('0', '').lstrip('0b').count('1'): 
            return i