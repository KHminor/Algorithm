def solution(x,y):
    xy = set(x) & set(y)
    if not xy: return "-1" 
    elif len(xy) == 1 and "0" in xy: return "0"
    return "".join(sorted([i*min(x.count(i),y.count(i)) for i in xy], reverse=True))