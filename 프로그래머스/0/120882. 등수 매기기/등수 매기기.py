def solution(score):
    li = [sum(i)/2 for i in score]
    result = [len(score)]*len(score)
    for i in range(len(li)):
        for j in range(len(li)):
            if i!=j and li[i] >= li[j]: result[i]-=1
    return result