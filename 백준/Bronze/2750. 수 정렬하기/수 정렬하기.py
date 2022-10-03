import sys
n = int(sys.stdin.readline())
li = [0]*n
for i in range(n):
    num = int(sys.stdin.readline())
    li[i]= num
li.sort()
for i in li:
    print(i)
