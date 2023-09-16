import sys
input = sys.stdin.readline

for i in range(int(input())):
    n,note1 = int(input()),set(map(int,input().rstrip('\n').split()))
    m,note2 = int(input()),list(map(int,input().rstrip('\n').split()))
    
    for i in note2:
        if i in note1: print(1)
        else: print(0)