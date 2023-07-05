def solution(number):
    ln, cnt = len(number), 0
    for i in range(ln-2):
        for j in range(i+1, ln-1):
            for z in range(j+1, ln):
                if number[i]+number[j]+number[z] == 0: cnt+= 1
    return cnt