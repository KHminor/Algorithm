import sys
input = sys.stdin.readline
s = input().rstrip('\n')
ln = len(s)
result = 1
for i in range(ln//2):
    if s[i] != s[ln-1-i]: 
        result = 0
        break
print(result)