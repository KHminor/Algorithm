import sys
input = sys.stdin.readline
n = int(input())
li = sorted(map(int,input().rstrip('\n').split()))
for i in range(1,n): li[i] += li[i-1]
print(sum(li))