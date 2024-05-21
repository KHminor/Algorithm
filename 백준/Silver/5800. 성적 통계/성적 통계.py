import sys
input = sys.stdin.readline

for t in range(1,int(input())+1):
    diff = 0
    n, *li = map(int,input().split())
    li.sort()
    for i in range(1,n): diff = max(diff, li[i]-li[i-1])
    print("Class %d"%t)
    print("Max %d, Min %d, Largest gap %d"%(li[-1],li[0],diff))