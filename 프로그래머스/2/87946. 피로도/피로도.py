def solution(k, dungeons):
    ln = len(dungeons)
    result = []
    visit = [0]*ln

    def dfs(val,cnt,check):
        if check == ln:
            result.append(cnt)
        else:
            for i in range(ln):
                if not visit[i]:
                    visit[i] = 1
                    if val >= dungeons[i][0]: dfs(val-dungeons[i][1],cnt+1,check+1)
                    else: dfs(val,cnt,check+1)
                    visit[i] = 0
        return
    
    dfs(k,0,0)
    return max(result)