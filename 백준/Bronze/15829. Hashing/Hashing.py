import sys
n = int(sys.stdin.readline())
li = list(sys.stdin.readline().rstrip('\n'))
st = {chr(96+x):x for x in range(1,27)}
print(sum([st[li[i]]*(31**i) for i in range(len(li))]) % 1234567891)
