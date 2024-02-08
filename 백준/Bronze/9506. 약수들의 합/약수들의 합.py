import sys
input = sys.stdin.readline

while True:
    n = int(input())
    if n == -1: break

    n_set = set()
    n_set.add(1)
    for i in range(2,n//2+1):
        if not n%i: 
            n_set.add(i)
            n_set.add(n//i)
    if sum(n_set) == n:
        print("%d = "%n, end="")
        s_n_set = sorted(list(n_set))
        for j in s_n_set:
            print("%d"%j, end="")
            if s_n_set[-1] != j: print(" + ", end="")
        print()
    else: print("%d is NOT perfect."%n)