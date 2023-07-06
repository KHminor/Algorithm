def solution(pgr, spd):
    li, result, check = [(100-pgr[i])//spd[i]+1 if (100-pgr[i])%spd[i] else (100-pgr[i])//spd[i] for i in range(len(spd))], [], 0
    for i in range(len(li)):
        if not result: result, check = [1], li[i]
        else:
            if li[i-1] >= li[i] or check >= li[i]: result[-1] += 1
            else: 
                check = li[i]
                result.append(1)
    return result