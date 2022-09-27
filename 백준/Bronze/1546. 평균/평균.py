import sys
n = int(sys.stdin.readline())
li = list(map(int,sys.stdin.readline().split()))
s = sum(li)
mx = max(li)
result = str(((s/n)/mx)*100)
b1,b2 = result[-1],result[-2]

if b1 == b2:
    print(format(float(result), '.6f'))
else:
    print(float(result))