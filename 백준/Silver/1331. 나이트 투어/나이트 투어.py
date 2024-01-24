import sys
input = sys.stdin.readline

mtx = [[0]*6 for _ in range(6)]
result = "Valid"
start = input().rstrip('\n')
first = start
mtx[int(start[1])-1][ord(start[0])-65] = 1

for _ in range(35):
    next = input().rstrip('\n')
    st,nx = [ord(start[0]),int(start[1])],[ord(next[0]),int(next[1])]
    if nx in [[st[0]+1,st[1]+2],[st[0]+1,st[1]-2],[st[0]-1,st[1]-2],[st[0]-1,st[1]+2],
                [st[0]+2,st[1]+1],[st[0]+2,st[1]-1],[st[0]-2,st[1]-1],[st[0]-2,st[1]+1]] and not mtx[nx[1]-1][nx[0]-65]: 
        mtx[nx[1]-1][nx[0]-65] = 1
        start = next
    else: 
        result = "Invalid"

for i in range(6):
    for j in range(6):
        if not mtx[i][j]:
            print("Invalid")
            sys.exit(0)

st,nx = [ord(start[0]),int(start[1])],[ord(first[0]),int(first[1])]
if nx in [[st[0]+1,st[1]+2],[st[0]+1,st[1]-2],[st[0]-1,st[1]-2],[st[0]-1,st[1]+2],
                [st[0]+2,st[1]+1],[st[0]+2,st[1]-1],[st[0]-2,st[1]-1],[st[0]-2,st[1]+1]] and result == "Valid": print("Valid")
else: print("Invalid")