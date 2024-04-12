def solution(sides):
    sides.sort()
    return len([i for i in range(sides[1]-sides[0]+1,sides[1]+1)] + [i for i in range(sides[1]+1, sum(sides))])