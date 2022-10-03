import sys
n,k = map(int,input().split())
arr = list(map(int,sys.stdin.readline().split()))
arr.sort(reverse=True)
print(arr[k-1])