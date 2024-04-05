import numpy as np
def solution(num_list, n):
    return np.array(num_list).reshape(len(num_list)//n,n).tolist()