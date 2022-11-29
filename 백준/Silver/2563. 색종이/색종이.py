import sys
paper = int(sys.stdin.readline())
arr = [[0]*100 for _ in range(100)]
cnt = 0
for _ in range(paper):
    si,sj = map(int,sys.stdin.readline().split())
    ei,ej = si+10,sj+10

    for i in range(si,ei):
        for j in range(sj,ej):
            if arr[i][j] == 0:
                arr[i][j] = 1
                cnt +=1

print(cnt)
