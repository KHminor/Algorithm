def solution(prices):
    result = [i for i in range(len(prices)-1,-1,-1)]
    stack = []
    for i,p in enumerate(prices):
        if stack:
            while stack and stack[-1][1] > p:
                idx,_ = stack.pop()
                result[idx] -= result[i]
        stack.append([i,p])
    return result