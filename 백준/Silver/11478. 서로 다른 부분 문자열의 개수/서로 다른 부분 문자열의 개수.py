import sys
input = sys.stdin.readline
n = input().rstrip('\n')
_set = set()
for i in range(1,len(n)+1):
    for j in range(len(n)):
        if len(n[j:j+i]) != i: break
        else: _set.add(n[j:j+i])
print(len(_set))