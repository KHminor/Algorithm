def solution(answers):
    result = []
    li = [[1,2,3,4,5],[2,1,2,3,2,4,2,5],[3,3,1,1,2,2,4,4,5,5]]
    mx = 0
    for i in range(len(li)):
        check = 0
        for j in range(len(answers)):
            if li[i][j%len(li[i])] == answers[j]: check += 1
        if check > mx: 
            result = [i+1]
            mx = check
        elif check == mx: result.append(i+1)

    return result