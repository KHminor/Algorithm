li = sorted([int(input()) for _ in range(10)])

mx,num = 0,-1
for i in set(li):
    cnt = li.count(i)
    if cnt > mx:
        mx = cnt
        num = i

print(sum(li)//10)
print(num)