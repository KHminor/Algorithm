import sys
n = int(sys.stdin.readline())

li = [int(sys.stdin.readline()) for _ in range(n)]

result = []
keep = []
oper = []
cnt = 0
for i in range(1,n+1):
    if i == n:
        result.append(i)
        oper.append('+')
        oper.append('-')
        if keep:
            while keep:
                result.append(keep.pop(-1))
                oper.append('-')
                if not keep:
                    break
    elif i == li[cnt]:
        result.append(i)
        oper.append('+')
        oper.append('-')
        cnt += 1
        if keep:
            while li[cnt] == keep[-1]:
                result.append(keep.pop(-1))
                oper.append('-')
                cnt += 1
                if not keep:
                    break
    else:
        keep.append(i)
        oper.append('+')

if li == result:
    for i in oper:
        print(i)
else:
    print('NO')