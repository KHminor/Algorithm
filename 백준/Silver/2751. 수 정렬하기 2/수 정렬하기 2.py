import sys
n = int(sys.stdin.readline())
li = []
for _ in range(n):
    num = int(sys.stdin.readline())
    li.append(num)
li.sort()
for i in li:
    print(i)
