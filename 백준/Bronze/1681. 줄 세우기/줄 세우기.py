n,l = input().split()
n = int(n)
result,cnt = 0,0

while cnt < n:
    result += 1
    if l not in str(result): cnt += 1
print(result)
