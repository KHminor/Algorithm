def solution(my_string):
    return "".join([i.lower() if 65<=ord(i)<=90 else i.upper()  for i in my_string])