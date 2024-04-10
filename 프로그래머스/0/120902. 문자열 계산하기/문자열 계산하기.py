def solution(my_string):
    li = my_string.split()
    result = int(li[0])
    oper = "+"
    for i in range(1,len(li)):
        if li[i] in {"+","-"}: oper = li[i]
        else: result = result + int(li[i]) if oper == "+" else result - int(li[i]) 
    return result