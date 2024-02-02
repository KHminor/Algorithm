n = int(input())
arrow = input()

mtx = [[""]*100 for _ in range(100)]
di = [[-1,0],[0,1],[1,0],[0,-1]]
now_di = 2
now = [50,50]
mtx[now[0]][now[1]] = "."

for k in range(n):
    if arrow[k] == "R": now_di = (now_di+1)%4
    elif arrow[k] == "L": 
        if 0 > now_di-1: now_di = 3
        else: now_di -= 1
    elif arrow[k] == "F":
        n_i,n_j = di[now_di][0],di[now_di][1]
        mtx[now[0]+n_i][now[1]+n_j] = "."
        now = [now[0]+n_i,now[1]+n_j]

result = []
for i in range(100):
    for j in range(100):
        if mtx[i][j] == ".": 
            result.append([i,j])

check = [100,100,-1,-1]

for i,j in result:
    check[0] = min(check[0],i)
    check[1] = min(check[1],j)
    check[2] = max(check[2],i)
    check[3] = max(check[3],j)

for i in range(check[0],check[2]+1):
    for j in range(check[1],check[3]+1):
        if mtx[i][j] == "": print("#",end="")
        else: print(mtx[i][j],end="")
    print()