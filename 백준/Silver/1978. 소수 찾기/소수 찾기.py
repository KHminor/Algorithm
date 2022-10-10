import sys
n = int(sys.stdin.readline())
result = 0
a = list(map(int,sys.stdin.readline().split()))
for i in a:
    status = 'True'
    if i == 1:
        continue
    for j in range(2,i):
        if i%j == 0:
            status = 'False'
            break
    if status == 'True':
        result += 1
print(result)