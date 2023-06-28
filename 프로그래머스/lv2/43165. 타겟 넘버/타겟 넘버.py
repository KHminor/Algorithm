def solution(numbers, target):
    answer = 0
    stack = [[0,0]] 
    while stack:
        idx, hap = stack.pop()
        if idx < len(numbers):
            stack.append([idx+1, hap+numbers[idx]])
            stack.append([idx+1, hap-numbers[idx]])
        else:
            if hap == target:
                answer += 1
    return answer