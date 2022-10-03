num_li = list(map(int,input()))
num_li.sort(reverse=True)
s = ''
for i in range(len(num_li)):
    s += str(num_li[i])

print(s)