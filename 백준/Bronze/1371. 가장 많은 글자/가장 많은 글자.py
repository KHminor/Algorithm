import sys 
input = sys.stdin.read

dic = {chr(i):0 for i in range(97, 123)}

for i in input().replace("\n",""):
    if i == " ": continue
    dic[i] += 1

mx = max(dic.values())
for i in dic.keys():
    if dic[i] == mx: print(i,end="")