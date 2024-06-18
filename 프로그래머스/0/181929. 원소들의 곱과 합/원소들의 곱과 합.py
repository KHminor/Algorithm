from functools import reduce
import operator

def solution(num_list):
    return 1 if reduce(operator.mul,num_list,1) < sum(num_list)**2 else 0