str = input()
li = []
for i in str:
    if i.islower():li.append(i.upper())
    else: li.append(i.lower())     
print("".join(li))