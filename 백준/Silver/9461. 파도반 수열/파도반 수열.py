li = [1, 1, 1]+[0]*97
for i in range(int(input())):
    n = int(input())
    if li[n-1] != 0: 
        print(li[n-1])
        continue
    for j in range(3, n):
        li[j] = li[j-3]+li[j-2]
    print(li[j])