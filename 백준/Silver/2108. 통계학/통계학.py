import sys

n = int(sys.stdin.readline())

li = [int(sys.stdin.readline()) for _ in range(n)]
li.sort()


cnt_li = dict.fromkeys(set(li),0)
mx = 0
mx_list = []
for i in li:
    cnt_li[i] += 1
    if cnt_li[i] > mx:
        mx = cnt_li[i]
        mx_list = [i]
    elif cnt_li[i] == mx:
        mx_list.append(i)

print(round(sum(li)/n))
print(li[n//2])
if len(mx_list) >1:
    print(sorted(mx_list)[1])
else:
    print(mx_list[0])
print(max(li)-min(li))


