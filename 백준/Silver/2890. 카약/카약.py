import sys
input = sys.stdin.readline

r,c = map(int,input().split())
li = [0]*(9)
for _ in range(r):
    kayak = input().strip('\n')
    for i in range(1,len(kayak)-1):
        if kayak[i] != ".": 
            li[int(kayak[i])-1] = i
            break

result = [0]*(9)

for i in range(9):
    cnt = 1
    s = set()
    for j in range(9):
        if i != j and li[i] < li[j] and li[j] not in s: 
            cnt += 1
            s.add(li[j])
    result[i] = cnt

[print(i) for i in result]