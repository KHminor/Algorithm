import sys
input = sys.stdin.readline
s = input().rstrip('\n')

for i in range(len(s)):
    if s[i:] == s[i:][::-1]:
        print(len(s)-len(s[i:])+len(s))
        break