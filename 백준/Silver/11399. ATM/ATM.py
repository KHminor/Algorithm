import sys
input = sys.stdin.readline
n = int(input())
result = 0
for i in sorted(map(int,input().rstrip('\n').split())):
    result += n*i
    n -= 1
print(result)