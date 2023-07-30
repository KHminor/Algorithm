def cycle(n):
    global cnt
    if n == 0: 
        cnt += 1
        return 
    elif n < 0: return
    for i in range(1,4):
        cycle(n-i)

for i in range(int(input())):
    n = int(input())
    cnt = 0
    cycle(n)
    print(cnt)