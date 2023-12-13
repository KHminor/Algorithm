import sys
input = sys.stdin.readline

dic = dict()
state = False
result = []
for _ in range(int(input())):
    name = input().rstrip('\n')
    try:
        if dic[name[0]]: 
            dic[name[0]] += 1
        if dic[name[0]] == 5: 
            state = True
            result.append(name[0])
    except: dic[name[0]] = 1
if not state: print("PREDAJA")
else: 
    for i in sorted(result): print(i,end="")