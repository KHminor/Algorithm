from collections import deque

def solution(prio, loca):
    new_prio, s_prio, flag, now_loca = deque(prio) ,deque(sorted(prio)), False, loca
    while s_prio:
        if now_loca == 0: 
            if s_prio[-1] == new_prio[0]:
                new_prio.popleft()
                s_prio.pop()
                flag = True
            else:
                new_prio.rotate(-1)
                now_loca = len(s_prio)-1
        else:
            if s_prio[-1] == new_prio[0]:
                new_prio.popleft()
                s_prio.pop()
            else: new_prio.rotate(-1)
            now_loca -= 1
        if flag: break
    return len(prio)-len(s_prio)