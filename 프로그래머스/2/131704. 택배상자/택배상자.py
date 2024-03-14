from collections import deque

def solution(order):
    main = []
    sub = deque([])
    idx = 0
    for i in range(1,len(order)+1):
        if i != order[idx]: 
            sub.appendleft(i)
        else:
            main.append(i)
            idx += 1
            while sub and sub[0] == order[idx]:
                idx += 1
                main.append(sub.popleft())
    return len(main)