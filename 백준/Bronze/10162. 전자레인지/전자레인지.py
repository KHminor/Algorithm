n = int(input())
a,b = divmod(n,300)
b,c = divmod(b,60)
c,d = divmod(c,10)
if d: print(-1)
else: print(a,b,c)