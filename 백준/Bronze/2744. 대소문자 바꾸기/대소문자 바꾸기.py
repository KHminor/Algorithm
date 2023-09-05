import sys
input = sys.stdin.readline
for i in list(input().rstrip('\n')): print(i.upper(),end='') if ord(i) >= 97 else print(i.lower(),end='')