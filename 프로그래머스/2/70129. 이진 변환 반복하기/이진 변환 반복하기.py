def solution(s):
    binary_cnt = zero_cnt = 0 
    while s != '1': 
        zero_cnt += s.count('0')
        s = bin(len(s.replace('0', '')))[2:]
        binary_cnt += 1  
    return [binary_cnt, zero_cnt]