import sys
input = sys.stdin.readline
n = int(input())
li = sorted(list(map(int,input().rstrip('\n').split())))
x = int(input())
result = 0
for i in range(n):
    s = i+1
    e = n-1
    while e>=s and n-1>=i:
        moc = (s+e)//2
        check = li[i]+li[moc]
        if check == x: 
            result += 1
            break
        elif check > x: e = moc-1
        else: s = moc+1

print(result)