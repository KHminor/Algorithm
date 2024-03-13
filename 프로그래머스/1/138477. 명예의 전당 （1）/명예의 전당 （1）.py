import heapq

def solution(k, score):
    result = [0]*len(score)
    li = [-1]*k
    num = 20000
    heapq.heapify(li)
    for i in range(len(score)):
        if score[i] >= li[0]:
            num = min(num, score[i]) 
            heapq.heappop(li)
            heapq.heappush(li,score[i]) 
        if k > i: result[i] = num
        else: result[i] = li[0]
    return result