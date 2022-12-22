import sys
from builtins import print

a = list(map(int,sys.stdin.readline().split()))
b = list(map(int,sys.stdin.readline().split()))

endwin = ''
aScore = bScore = 0

for i in range(10):
    if a[i] == b[i]:
        aScore += 1
        bScore += 1
    elif a[i] > b[i]:
        aScore += 3
        endwin = 'A'
    else:
        bScore += 3
        endwin = 'B'


print(aScore,bScore)
if aScore == bScore:
    if endwin == '':
        print('D')
    else:
        print(endwin)
elif aScore > bScore:
    print('A')
else:
    print('B')


