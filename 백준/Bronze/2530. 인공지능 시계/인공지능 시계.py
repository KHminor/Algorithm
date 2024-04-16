h,m,s = map(int,input().split())
b,c = divmod(int(input())+s,60)
a,b = divmod(b+m,60)
a = (h+a)%24 if h+a>=24 else h+a
print(a,b,c)