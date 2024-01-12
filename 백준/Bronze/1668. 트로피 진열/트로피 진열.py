import sys
input = sys.stdin.readline

def find(arr):
    cnt,mx = 1,arr[0]
    for i in range(1,len(arr)):
        if arr[i] > arr[i-1] and arr[i] > mx: 
            mx = arr[i]
            cnt +=1
    return cnt

li = [int(input()) for _ in range(int(input()))]

print(find(li))
li.reverse()
print(find(li))