# import sys
# sys.setrecursionlimit(200000)
# li = [0,1] + [ -1 for _ in range(100000)]

# def solution(n):
#     if li[n] != -1 : return li[n]
#     li[n] = ((solution(n-1) + solution(n-2)))%1234567
#     return li[n]%1234567

def solution(n):
    f_list = [0,1]
    for i in range(2,n+1):
        f_list.append((f_list[i-2]%1234567+f_list[i-1]%1234567)%1234567)
    return f_list[-1]

