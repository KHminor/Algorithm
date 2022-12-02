n = int(input())
cnt = 0
s = '666'
i = 0
while True:
    if s in str(i):
        cnt += 1
        if cnt == n:
            break
    i+=1
print(i)