import sys
input = sys.stdin.readline
n,k = map(int,input().split())
li = [int(input()) for _ in range(n)]

start = min(li)
end = start+k

result = 0
while end >= start:
    mid = (start+end)//2

    hap = 0
    for i in li:
        if mid >i: hap += mid-i
    
    if k >= hap:
        start = mid+1
        result = max(mid,result)
    else: end = mid-1
print(result)