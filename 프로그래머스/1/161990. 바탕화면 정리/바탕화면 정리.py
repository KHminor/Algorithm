def solution(wallpaper):
    li = []
    for i in range(len(wallpaper)):
        for j in range(len(wallpaper[i])):
            if wallpaper[i][j] == "#": li.append([i,j])
    lux,luy,rdx,rdy = 50,50,0,0
    for i,j in li:
        a,b = i,j
        lux,luy = min(a,lux),min(b,luy)
        rdx,rdy = max(a,rdx),max(b,rdy)
    return lux,luy,rdx+1,rdy+1