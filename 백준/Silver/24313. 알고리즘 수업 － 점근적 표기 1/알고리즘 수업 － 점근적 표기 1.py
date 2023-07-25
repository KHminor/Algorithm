a,b = map(int,input().split())
c = int(input())
d = int(input())
print( 1 if a*d+b <= c*d and a<=c else 0 )