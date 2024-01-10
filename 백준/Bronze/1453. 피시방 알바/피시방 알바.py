import sys
input = sys.stdin.readline

n = int(input())
dic = {i:0 for i in range(1,101)}

result = 0
for i in list(map(int,input().split())):
    if not dic[i]: dic[i] += 1
    else: result += 1 

print(result)