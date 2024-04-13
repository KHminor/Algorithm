def solution(dots):
    def slope(first, second):
        return (second[1] - first[1]) / (second[0] - first[0])
    for i in range(3):
        mydots = dots[:]
        if slope(mydots.pop(), mydots.pop(i)) == slope(mydots.pop(), mydots.pop()):
            return 1
    return 0