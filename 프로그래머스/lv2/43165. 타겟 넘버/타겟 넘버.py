from collections import deque

def solution(numbers, target):
    answer = 0
    stack = deque([[0,0]]) 
    while stack:
        idx, hap = stack.popleft()
        if idx < len(numbers):
            stack.append([idx+1, hap+numbers[idx]])
            stack.append([idx+1, hap-numbers[idx]])
        else:
            if hap == target:
                answer += 1
    return answer