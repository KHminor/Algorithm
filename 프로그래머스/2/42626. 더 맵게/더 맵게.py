import heapq

def solution(s, K):
    state = True
    for i in s:
        if K > i: 
            state = False
            break 
    if state: return 0

    result = 0
    s.sort()
    heapq.heapify(s)

    while len(s) >= 2:
        heapq.heappush(s,heapq.heappop(s)+heapq.heappop(s)*2)  
        result += 1
        if s[0] >= K: return result

    return -1