from collections import deque
def solution(begin, target, words):
    if target not in words: return 0
    w_ln = len(words)
    que = deque([[begin,0]])

    while True:
        b, idx = que.popleft()
        visit, flag = [0]*w_ln, False
        if b == target: break

        for i in range(w_ln):
            for j in range(len(words[i])): 
                if b[j] == words[i][j]: visit[i] += 1
        
        for i in range(w_ln):
            if len(begin)-1 == visit[i]:
                if words[i] == target: 
                    idx += 1
                    flag = True
                    break 
                que.append([words[i], idx+1])
                words[i] = ''
        if flag: break

    return idx