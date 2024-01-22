a,b = input(), input()
a_dic,b_dic = {i:0 for i in set(a)},{i:0 for i in set(b)}

for i in a: a_dic[i] += 1
for i in b: b_dic[i] += 1

result = 0
for i in list(set(a).intersection(set(b))):
    result += min(a_dic[i],b_dic[i])

print(len(a)+len(b)-(result*2))