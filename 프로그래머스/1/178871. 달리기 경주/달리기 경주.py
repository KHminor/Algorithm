def solution(players, callings):
    dic = {players[i]:i for i in range(len(players))}
    for i in callings:
        idx = dic[i]
        dic[i] -= 1
        dic[players[idx-1]] += 1
        players[idx],players[idx-1] = players[idx-1],players[idx]
    return sorted(dic,key=dic.get)