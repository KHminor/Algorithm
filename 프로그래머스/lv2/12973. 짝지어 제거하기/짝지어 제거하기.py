def solution(s):
    stack,s = [], s
    for i in s:
        if not stack: stack.append(i)
        else:
            if stack[-1] == i:
                stack.pop()
            else: stack.append(i)
        # if s == ''.join(stack) or stack == []: break
    return 0 if len(stack) else 1