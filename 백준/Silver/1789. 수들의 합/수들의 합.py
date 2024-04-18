n = int(input())
cnt = 0
hap = 0

for i in range(1, n+1):
    cnt += 1
    hap += i
    if hap > n:
        cnt -= 1 
        break
print(cnt) 