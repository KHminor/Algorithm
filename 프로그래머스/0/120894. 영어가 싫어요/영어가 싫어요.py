def solution(numbers):
    for i,v in enumerate(["zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"]):
        numbers = numbers.replace(v,str(i))
    return int(numbers)