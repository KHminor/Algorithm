def solution(s): 
    ln = len(s)
    return s[ln//2] if ln%2 else s[ln//2-1:ln//2+1]