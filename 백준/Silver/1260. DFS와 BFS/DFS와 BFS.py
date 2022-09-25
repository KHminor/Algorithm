def dfs(v):
    visited = [0]*(N+1)
    stack = [v]

    while stack:
        v = stack.pop()
        if visited[v] == 1:
            continue
        print(v, end=' ')
        visited[v] = 1
        li = ch[v][:]
        li.sort(reverse=True)

        for i in li:
            if visited[i] == 0 :
                stack.append(i)

def bfs(v):
    visitied = [0]*(N+1)
    q = [v]

    while q:
        v = q.pop(0)
        if visitied[v] == 1:
            continue
        print(v, end=' ')

        visitied[v] = 1
        li = ch[v]
        li.sort()
        for i in li:
            if visitied[i] == 0:
                q.append(i)

N,M,V = map(int,input().split())
ch = [[]*(N+1) for _ in range(N+1)]
t = [0]*(N+1)
for _ in range(M):
    p,c = map(int,input().split())
    ch[p].append(c)
    ch[c].append(p)

dfs(V)
print()
bfs(V)
print()