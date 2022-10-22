import sys

k,n = map(int,sys.stdin.readline().split())
li = [i for i in range(1,k+1)]
print('<', end='')
s = -1
while len(li) != 0:
    if len(li) == 1:
        print(li.pop(), end='')
        break
    s += n
    if s >= k:
        s %= k
    print(li.pop(s), end='')
    print(', ', end='')
    k -= 1
    s -= 1
print('>')