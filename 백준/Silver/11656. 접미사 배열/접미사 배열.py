import sys
input = sys.stdin.readline
s = input().rstrip('\n')
for i in sorted([s[i:] for i in range(len(s))]): print(i)