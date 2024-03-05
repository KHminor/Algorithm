from collections import deque

def solution(numbers):
    answer = [-1]*len(numbers)
    q = deque([(numbers[0],0)])
    for i,n in enumerate(numbers[1:]):
        while q and q[0][0]<n:
            _,idx = q.popleft()
            answer[idx] = n
        q.appendleft((n,i+1))
    return answer