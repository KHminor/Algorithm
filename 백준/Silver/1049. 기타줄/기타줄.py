import sys
input = sys.stdin.readline

m,n = map(int,input().split())
f_li, li = [0]*n, [0]*n
result = 0

for i in range(n):
    x,y = map(int,input().split())
    f_li[i], li[i] = x, y

f_li.sort()
li.sort()

if li[0]*6 > f_li[0]: 
    result = (m//6)*f_li[0]
    if m%6*li[0] > f_li[0]: result += f_li[0]
    else: result += m%6*li[0] 
else: result = m*li[0]
print(result)