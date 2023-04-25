import sys
li = [int(sys.stdin.readline()) for _ in range(9)]
print(max(li))
print(li.index(max(li))+1)