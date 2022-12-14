x = int(input())
ch_li = [1000001]*(x+4)
ch_li[1],ch_li[2],ch_li[3] = 0,1,1

for i in range(4,x+1):
    if i%3 == 0 and i%2 == 0:
        ch_li[i] = min(ch_li[i//3],ch_li[i//2],ch_li[i-1])+1
    elif i%3 == 0:
        ch_li[i] = min(ch_li[i//3],ch_li[i-1])+1
    elif i%2 == 0:
        ch_li[i] = min(ch_li[i//2],ch_li[i-1])+1
    else:
        ch_li[i] = ch_li[i-1]+1
print(ch_li[x])