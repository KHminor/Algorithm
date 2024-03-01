def solution(n,a,b):
    li = [i+1 for i in range(n)]
    cnt, flag = 0, False
    while True:
        cnt += 1 
        new_li = []
        for i in range(len(li)//2):
            if li[i*2] in [a,b] and li[i*2+1] in [a,b]:
                flag = True
                break
            elif li[i*2] in [a,b]: new_li.append(li[i*2])
            else : new_li.append(li[i*2+1])
        li = new_li
        if flag: break
    return cnt