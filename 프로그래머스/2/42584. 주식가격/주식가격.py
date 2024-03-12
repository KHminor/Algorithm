def solution(prices):
    li = [i for i in range(len(prices)-1,-1,-1)]
    for i in range(len(prices)):
        cnt = 1
        for j in range(i+1,len(prices)):
            if prices[i] > prices[j]: 
                li[i] = cnt
                break
            else: cnt += 1
    return li