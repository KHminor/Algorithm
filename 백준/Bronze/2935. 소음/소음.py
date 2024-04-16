li = []
for i in range(3):
    x = input()
    li.append(int(x) if x.isdigit() else x)
print(li[0]*li[-1] if li[1]=="*" else li[0]+li[-1])