import sys
input = sys.stdin.readline

r = int(input())
sang = input().rstrip('\n')

n = int(input())
li = [input().rstrip('\n') for _ in range(n)]

num,mx_num = 0,0
for i in range(r):
    check = [0,0,0]
    for j in range(n):
        if li[j][i] == 'R': check[0] += 1
        elif li[j][i] == 'S': check[1] += 1
        else: check[2] += 1
    
    if sang[i] == 'R': num += (check[0]+check[1]*2)
    elif sang[i] == 'S': num += (check[1]+check[2]*2)
    else: num += (check[2]+check[0]*2)

    mx_num += max(check[0]+check[1]*2,check[1]+check[2]*2,check[2]+check[0]*2)

print(num)
print(mx_num)