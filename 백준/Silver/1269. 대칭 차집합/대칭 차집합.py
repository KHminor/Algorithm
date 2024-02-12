import sys
input = sys.stdin.readline

a_ln,b_ln = map(int,input().split())
a = set(map(int,input().split()))
b = set(map(int,input().split()))
inter = a.intersection(b)
print(len(a)+len(b)-(2*len(inter)))