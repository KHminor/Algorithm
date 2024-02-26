
def solution(c):
    if c[1]-c[0] == c[2]-c[1]:
        return c[-1]+c[2]-c[1]
    else: return c[-1]*(c[2]//c[1])