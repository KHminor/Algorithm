import sys
input = sys.stdin.readline

for _ in range(int(input())):
    li = sorted(map(int,input().split()))
    if li[3]-li[1] >= 4: print("KIN")
    else: print(sum(li[1:4]))