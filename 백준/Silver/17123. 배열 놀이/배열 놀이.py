import sys
input = sys.stdin.readline

for _ in range(int(input())):
    n,m = map(int,input().rstrip('\n').split())
    arr = [ list(map(int,input().rstrip('\n').split())) for _ in range(n)]
    result = [[],[]]
    for i in range(n): result[0].append(sum(arr[i]))
    for i in range(n): result[1].append(sum([arr[j][i] for j in range(n)]))

    for _ in range(m):
        r1, c1, r2, c2, v = map(int,input().rstrip('\n').split())
        for i in range(r1-1,r2): result[0][i] += (c2-c1+1)*v
        for i in range(c1-1,c2): result[1][i] += (r2-r1+1)*v
    [print(*i) for i in result]
