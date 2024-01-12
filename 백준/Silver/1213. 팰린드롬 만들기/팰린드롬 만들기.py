import sys
name = input()
result = [""]*len(name)
dic = dict()
for i in name:
    if dic.get(i) == None: dic[i] = 1
    else: dic[i] += 1

s,e,hol = 0,len(name)-1,""

for i in range(65,91):
    c = chr(i)
    if dic.get(c) != None:
        if dic[c]%2: 
            if hol == "": hol = c
            else:
                print("I'm Sorry Hansoo")
                sys.exit(0)
        
        for j in range(dic[c]//2): result[s+j],result[e-j] = c,c
        s,e = s+(dic[c]//2),e-(dic[c]//2)
if len(name)%2: result[len(name)//2] = hol
print("".join(result))