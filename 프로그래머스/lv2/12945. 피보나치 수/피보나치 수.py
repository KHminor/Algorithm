import sys
sys.setrecursionlimit(200000)
li = [0,1] + [ -1 for _ in range(100000)]

def solution(n):
    if li[n] != -1 : return li[n]
    li[n] = ((solution(n-1) + solution(n-2)))%1234567
    return li[n]%1234567

