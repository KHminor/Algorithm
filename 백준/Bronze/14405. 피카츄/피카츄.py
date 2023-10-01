import sys
input = sys.stdin.readline
s = list(input().rstrip('\n'))
ln = len(s)
cnt = 0
while cnt != ln:
    try:
        if s[0:3] == ['c','h','u']: del s[0:3]
        elif s[0:2] in [['p','i'],['k','a']]: del s[0:2]
        cnt +=1
    except:
        break
print('NO') if s else print('YES')