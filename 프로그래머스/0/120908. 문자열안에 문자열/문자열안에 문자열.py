def solution(str1, str2):
    ln = len(str1)
    st = str1.replace(str2,"")
    return 2 if ln == len(st) else 1