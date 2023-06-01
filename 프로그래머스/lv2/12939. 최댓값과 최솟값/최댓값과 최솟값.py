def solution(s):
    answer = ''
    li = [int(i) for i in s.split()]
    answer = "%d %d"%(min(li), max(li) )
    return answer