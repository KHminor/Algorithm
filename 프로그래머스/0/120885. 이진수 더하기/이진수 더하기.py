# def solution(bin1, bin2):
#     result,num = [], int(bin1)+int(bin2)
#     be = 0
#     while num != 0:
#         moc,na = divmod(num,10)
#         num = moc
#         result.append(str((na+be)%2))
#         if na+be >= 2: be = 1
#     if be == 1: result.append("1")    
#     return "".join(result[::-1])

def solution(bin1, bin2):
    return str(bin(int(bin1,2)+int(bin2,2)))[2:]