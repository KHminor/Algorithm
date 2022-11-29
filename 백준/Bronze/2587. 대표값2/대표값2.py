import sys

li = [int(sys.stdin.readline()) for _ in range(5)]
li.sort()
print(round(sum(li)/5))
print(li[2])