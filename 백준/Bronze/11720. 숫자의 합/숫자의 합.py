import sys
n = int(sys.stdin.readline()) 
result = 0
for i in sys.stdin.readline().rstrip():
    result += int(i) 
print(result)