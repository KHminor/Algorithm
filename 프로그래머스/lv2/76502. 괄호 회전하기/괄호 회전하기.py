from collections import deque
def solution(s):
    l_s = len(s)
    if l_s%2: return 0
    q, cnt = deque(s), 0
    for _ in range(l_s):
        flag, stack = True, []
        for i in range(l_s):
            if q[i] in ['[', '{', '(']: stack = stack + [q[i]]
            else:
                if stack == []: 
                    flag = False
                    break
                else:
                    if (stack[-1] == '[' and q[i] == ']') or (stack[-1] == '{' and q[i] == '}') or (stack[-1] == '(' and q[i] == ')'): stack.pop()
                    else:
                        flag = False
                        break  
                    
        if flag and stack == []: cnt += 1 
        q.rotate(-1)
    return cnt