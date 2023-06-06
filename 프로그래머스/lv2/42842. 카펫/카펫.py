def solution(brown, yellow):
    size = brown+yellow
    for i in range(size+1,1,-1):
        if size%i==0:
            div = size/i
            if (i-2) * (div - 2) == yellow:
                return [i,div]
            
        