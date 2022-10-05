a = int(input())
b = int(input())
c = int(input())

gob = list(str(a*b*c))
ch_li = [str(i) for i in range(10)]
resutl = [0]*10
for i in range(len(ch_li)):
    for j in gob:
        if ch_li[i] == j:
            resutl[i] += 1
    print(resutl[i])