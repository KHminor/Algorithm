def solution(n):
    answer, cnt = 0, 1
    while cnt <= n:
        hap = 0
        for i in range(cnt,n+1):
            hap += i
            if hap < n: continue
            else: 
                if hap == n: answer += 1
                cnt += 1
                break
    return answer
solution(15)
