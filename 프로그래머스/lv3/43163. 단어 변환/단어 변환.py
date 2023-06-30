from collections import deque
def solution(begin, target, words):
    if target not in words: return 0
    w_ln = len(words)
    que = deque([[begin,0]])

    while True:
        b, idx = que.popleft()
        visit = [0]*w_ln
        if b == target: break

        for i in range(w_ln):
            for j in range(len(words[i])):
                if b[j] == words[i][j]: visit[i] += 1
        
        for i in range(w_ln):
            if len(begin)-1 == visit[i]:
                que.append([words[i], idx+1])
                words[i] = ''

    return idx