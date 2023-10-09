import sys
input = sys.stdin.readline
n,f = input().rstrip('\n'),int(input().rstrip('\n'))
for i in range(int(n[:-2]+'00'),int(n[:-2]+'99')+2):
    if not i%f:
        print(str(i)[-2:])
        break