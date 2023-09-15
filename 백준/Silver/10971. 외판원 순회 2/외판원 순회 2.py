import sys
input = sys.stdin.readline

def find(cnt,val,before):
    global result
    if cnt == n and result > val: 
        result = val
        return
    for i in range(n):
        if not visit[i] and not visit2[before] and mtx[before][i]:
            visit[i],visit2[before],val = 1,1,val+mtx[before][i]
            find(cnt+1,val,i)
            visit[i],visit2[before],val = 0,0,val-mtx[before][i]
    return

n = int(input())
mtx = [list(map(int,input().rstrip('\n').split())) for _ in range(n)]
result = sys.maxsize
visit = [0]*n
visit2 = [0]*n
find(0,0,0)
print(result)