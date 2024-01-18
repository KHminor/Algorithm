dic = {chr(i+96):i for i in range(1,27)}
pt = list(input())
cy = list(input())
cy = cy*((len(pt)//len(cy))+1) if len(pt)%len(cy) else cy*(len(pt)//len(cy))
result = []

for i in range(len(pt)):
    if pt[i] == " ":
        result.append(" ")
        continue
    p,c = dic[pt[i]],dic[cy[i]]
    if p > c: result.append(chr(96+p-c))
    else: result.append(chr(96+26+p-c))
print("".join(result))