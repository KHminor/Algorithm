import sys
input = sys.stdin.readline
result = 0

for i in range(int(input())):
    val = input().rstrip('\n')
    stack = []
    for j in range(len(val)):
        if len(stack) and stack[-1] == val[j]: stack.pop()
        else: stack.append(val[j])
    if stack == []: result += 1
print(result)