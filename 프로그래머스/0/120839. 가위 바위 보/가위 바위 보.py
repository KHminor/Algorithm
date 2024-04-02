def solution(rsp):    
    return "".join(["0" if i=="2" else "5" if i=="0" else "2" for i in rsp] )