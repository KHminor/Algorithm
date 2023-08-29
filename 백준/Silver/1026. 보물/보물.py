import sys
input = sys.stdin.readline
n = int(input())
a = sorted(map(int,input().rstrip('\n').split()))
b = sorted(map(int,input().rstrip('\n').split()),reverse=True)
print(sum([a[i]*b[i] for i in range(n)]))