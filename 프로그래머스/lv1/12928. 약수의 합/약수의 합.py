def solution(n):
    answer = []
    for i in range(1, n+1):
        if i in answer: break
        elif not n%i:
            answer.append(i)
            if n//i in answer: break
            else: answer.append(n//i)
    return sum(answer)