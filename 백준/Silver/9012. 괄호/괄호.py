import sys
for i in range(int(sys.stdin.readline())):
    vps_test = list(sys.stdin.readline().rstrip('\n'))

    stack = []
    for j in vps_test:
        if j == ')' and stack and stack[-1] == '(':
            stack.pop()
        else:
            stack.append(j)
    if stack:
        print('NO')
    else:
        print('YES')