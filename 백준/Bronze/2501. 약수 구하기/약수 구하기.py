import sys
input = sys.stdin.readline
n,k =map(int,input().split())
li = []
for i in range(1, n//2):
    if n%i == 0:
        if i != n//i: li.append(n//i)
        li.append(i)
li = sorted(list(set(li)))
try: print(li[k-1])
except: print(0)