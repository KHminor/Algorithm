def solution(emergency):
    li = sorted(emergency, reverse=True)
    return [li.index(i)+1 for i in emergency]