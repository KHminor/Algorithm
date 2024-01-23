n = int(input())
ln_n = len(str(n))
li = [str(i) for i in range(1,n+1)]
st = "".join(li)
for i in range(len(st)-ln_n+1):
    if int(st[i:i+ln_n]) == n:
        print(i+1)
        break