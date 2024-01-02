import sys
n,l,d = map(int,input().split())

e_song,e_rest,bell = 0,0,0
for _ in range(n):
    e_song += l
    e_rest = e_song+5
    while e_rest > bell:
        if e_song <= bell < e_rest:
            print(bell)
            sys.exit(0)
        else: bell += d
    e_song = e_rest
print(bell)