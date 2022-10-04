import sys
n = int(sys.stdin.readline())
li = []
for _ in range(n):
    a,b = sys.stdin.readline().split()
    a = int(a)
    li.append([a,b])
li.sort(key=lambda x:x[0])

for i in li:
    print(i[0],i[1])