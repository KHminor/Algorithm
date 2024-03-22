from collections import Counter
def solution(topping):
    result = 0
    bro = Counter(topping)
    chul = set()
    for i in topping:
        bro[i] -= 1
        if not bro[i]: del bro[i]
        chul.add(i)
        if len(bro) == len(chul): result += 1
    return result