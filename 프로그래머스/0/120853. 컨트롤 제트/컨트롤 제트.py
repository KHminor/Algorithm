def solution(s):
    result = 0
    b = ""
    for i in s.split():
        if i == "Z":
            result -= int(b)
        else:
            b = i
            result += int(i)
    return result