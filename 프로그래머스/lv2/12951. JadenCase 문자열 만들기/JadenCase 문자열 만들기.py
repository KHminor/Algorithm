# def solution(s):
#     answer = ''
    
#     if len(s.split()) > 1:
#         li = [(i[0] if i[0] in [str(j) for j in range(10)] else i[0].upper())+i[1:].lower() for i in s.split(" ")]
#         for i in range(len(li)-1): answer = answer + li[i] + ' '
#         return answer + li[-1]
#     else:
#         st = (s[0] if s[0] in [str(j) for j in range(10)] else s[0].upper())+s[1:].lower()
#         return st
    
    
def solution(s):
    answer = [(i[0].upper()+i[1:].lower() if i else i ) for i in s.split(" ")]
    
    return ' '.join(answer)