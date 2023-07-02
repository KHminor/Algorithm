def solution(price, money, count):
    hap = sum([price*i for i in range(1,count+1)])
    return 0 if money-hap >= 0 else hap-money