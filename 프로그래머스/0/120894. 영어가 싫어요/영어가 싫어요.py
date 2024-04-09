def solution(numbers):
    dic = {"zero":"0", "one":"1", "two":"2", "three":"3", "four":"4", "five":"5", "six":"6", "seven":"7", "eight":"8", "nine":"9"}
    idx = 0
    result = []
    while idx < len(numbers):
        if dic.get(numbers[idx:idx+3]):
            result.append(dic[numbers[idx:idx+3]])
            idx += 3
        elif dic.get(numbers[idx:idx+4]): 
            result.append(dic[numbers[idx:idx+4]])
            idx += 4
        else:
            result.append(dic[numbers[idx:idx+5]])
            idx += 5
    return int("".join(result))