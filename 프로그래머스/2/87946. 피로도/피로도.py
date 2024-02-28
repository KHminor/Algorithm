from itertools import permutations

def solution(k, dungeons):
    result = 0    
    for i in list(permutations(dungeons,len(dungeons))):
        pe,cnt = k,0
        for dun in i:
            if pe >= dun[0]:
                pe -= dun[1]
                cnt += 1
        result = max(result,cnt)
    return result