import sys
input = sys.stdin.readline

move = {
    "T": [1,0],
    "B": [-1,0],
    "L": [0,-1],
    "R": [0,1],
    "LT": [1,-1],
    "RT": [1,1],
    "LB": [-1,-1],
    "RB": [-1,1],
    }

k,s,n = input().rstrip('\n').split()
k_pos,s_pos = [int(k[1]),ord(k[0])-64], [int(s[1]),ord(s[0])-64]

for _ in range(int(n)):
    y,x = move[input().rstrip('\n')]
    if 1<=k_pos[0]+y<=8 and 1<=k_pos[1]+x<=8:
        if k_pos[0]+y == s_pos[0] and k_pos[1]+x == s_pos[1] and 1<=s_pos[0]+y<=8 and 1<=s_pos[1]+x<=8:
            s_pos = [s_pos[0]+y,s_pos[1]+x]
        elif k_pos[0]+y == s_pos[0] and k_pos[1]+x == s_pos[1] and not(1<=s_pos[0]+y<=8 and 1<=s_pos[1]+x<=8): continue
        k_pos = [k_pos[0]+y,k_pos[1]+x]
print(chr(k_pos[1]+64)+str(k_pos[0]))
print(chr(s_pos[1]+64)+str(s_pos[0]))
