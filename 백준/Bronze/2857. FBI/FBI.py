import sys
input = sys.stdin.readline

result = []
for i in range(5):
    name = input().rstrip('\n')
    for j in range(len(name)-2):
        if name[j:j+3] == "FBI": 
            result.append(i+1)
            break

if result == []: print("HE GOT AWAY!")
else: print(*result)