a,b = input().split()
a_ln,b_ln = len(a),len(b)
y,x = 0,0
for i in range(a_ln):
    state = False
    for j in range(b_ln):
        if a[i] == b[j]:
            y,x = j,i
            state = True
            break
    if state: break

mtx = [["."]*a_ln for _ in range(b_ln)]

for i in range(b_ln): mtx[i][x] = b[i]
for i in range(a_ln): mtx[y][i] = a[i]
for i in range(b_ln): print("".join(mtx[i]))