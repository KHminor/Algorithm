for i in range(int(input())):
    result = 0
    for v in input().split():
        if v.isdigit(): result += int(v)
        elif v.count('.'): result += float(v)
        else:
            if v == '@': result *= 3
            elif v == '%': result += 5
            else: result -= 7
    print(f"{result:.2f}")