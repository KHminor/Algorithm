import sys
input = sys.stdin.readline

def find(num):
    for i in range(3):
        if num%li[i]: continue
        for j in range(i+1,4):
            if num%li[j]: continue
            for k in range(j+1,5):
                if num%li[k]: continue
                else: return True
    return False

li = sorted(list(map(int,input().split())))
result = li[0]

while True:
    if find(result): 
        print(result)
        break
    else: result += 1