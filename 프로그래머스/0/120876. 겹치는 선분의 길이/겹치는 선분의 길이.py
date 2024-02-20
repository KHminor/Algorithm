def solution(lines):
    li = [set()]*3
    for i in range(3): li[i] = set(range(lines[i][0],lines[i][1]))
    return len(li[0].intersection(li[1]).union(li[0].intersection(li[2])).union(li[1].intersection(li[2])))