import sys
input = sys.stdin.readline
n = int(input())
li = sorted([list(map(int,input().rstrip('\n').split())) for _ in range(n)], key= lambda x: (x[1],x[0]), reverse=True)
result = [li[0]]
for i in range(1,n):
    if result[-1][0] >= li[i][1]: result.append(li[i])
    else:
        bf = result[-1][1]-result[-1][0]
        at = li[i][1]-li[i][0]
        if bf > at and result[-1][1]>=li[i][1] and result[-1][0]<=li[i][0]: result[-1] = li[i]
print(len(result))