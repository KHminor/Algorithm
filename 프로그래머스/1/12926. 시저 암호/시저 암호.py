def solution(s, n):
    li = []
    for i in s:
        if i == " ": li.append(" ")
        else:
            num = ord(i)
            x = 0
            if 65 <= num <= 90: x = num+n if 90 >= num+n else (num+n)%90+64 
            else: x = num+n if 122 >= num+n else (num+n)%122+96
            li.append(chr(x)) 
    return "".join(li)