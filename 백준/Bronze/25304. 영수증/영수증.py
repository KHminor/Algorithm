import sys
x = int(sys.stdin.readline()) # 영수증 총 금액
n = int(sys.stdin.readline()) # 물건의 종류의 수
sum = 0
for _ in range(n):
    cost,cnt = map(int,sys.stdin.readline().split())
    sum += cost*cnt

if x == sum:
    print('Yes')
else:
    print('No')
