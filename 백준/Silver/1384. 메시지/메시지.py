import sys
input = sys.stdin.readline

tc = 1
while True:
    n = int(input())
    if not n: break

    name = [""]*n
    check = [[0] for _ in range(n)]
    state = True

    for i in range(n):
        li = list(input().rstrip('\n').split())
        name[i] = li[0]
        for j in range(1,n):
            if li[j] == "N": 
                if check[i][0] == 0: check[i][0] = j
                else: check[i].append(j)
                if state: state = False
    
    print("Group %d"%tc)
    for i in range(n):
        if check[i] != [0]:
            for j in check[i]:
                devil = name[i-j] if i-j >=0 else name[n+i-j]
                print("%s was nasty about %s"%(devil,name[i]))
    
    if state: print("Nobody was nasty")
    print()
    tc += 1
