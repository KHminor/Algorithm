import sys

arr = [0]*31
for _ in range(28):
    arr[int(sys.stdin.readline())] = 1

for i in range(1,31):
    if not arr[i]:
        print(i)
