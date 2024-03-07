def solution(n):
    li = [1]*(n+1)
    for i in range(2,n+1):
        for j in range(2*i,n+1,i): li[j] = 0
    return sum(li[2:])