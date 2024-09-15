def solution(brown, yellow):
    c_size = brown + yellow
    for i in range(int(c_size**(1/2)),1,-1):
        if c_size%i == 0:
            side = c_size/i
            if (i-2)*(side-2) == yellow: 
                return [max([i,side]), min([i,side])]
            
        