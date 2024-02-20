def solution(wallpaper):
    li = [[],[]]
    for i in range(len(wallpaper)):
        for j in range(len(wallpaper[i])):
            if wallpaper[i][j] == "#": 
                li[0].append(i)
                li[1].append(j)
    return [min(li[0]),min(li[1]),max(li[0])+1,max(li[1])+1]