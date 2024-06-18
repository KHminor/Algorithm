def solution(str_list, ex):
    return "".join([i for i in str_list if i.find(ex) == -1])