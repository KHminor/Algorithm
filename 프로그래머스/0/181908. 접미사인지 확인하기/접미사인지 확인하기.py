def solution(my_string, is_suffix):
    return 1 if is_suffix in {my_string[i:] for i in range(len(my_string))} else 0