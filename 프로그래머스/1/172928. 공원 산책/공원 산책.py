def solution(park, routes):
    for i in range(len(park)):
        for j in range(len(park[i])):
            if park[i][j] == "S":  
                y,x = i,j  
                for k in routes: 
                    op,n = k.split() 
                    n = int(n)
                    state = True
                    if op == "E" and x+n < len(park[i]): 
                        for l in range(1,n+1): 
                            if park[y][x+l] == "X": 
                                state = False
                                break
                        if state: x += n   
                    elif op == "W" and x-n >= 0: 
                        for l in range(1,n+1): 
                            if park[y][x-l] == "X": 
                                state = False
                                break
                        if state: x -= n
                    elif op == "S" and y+n < len(park): 
                        for l in range(1,n+1): 
                            if park[y+l][x] == "X": 
                                state = False
                                break
                        if state: y += n
                    elif op == "N" and y-n >= 0: 
                        for l in range(1,n+1): 
                            if park[y-l][x] == "X": 
                                state = False
                                break
                        if state: y -= n
                return [y,x]