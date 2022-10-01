n = list(input())
sch_li = ['c','d','l','n','s','z']
cnt = i = 0

while i < len(n):
    if n[i] in sch_li:
        if n[i] == 'd':
            if i <= len(n)-2 and n[i:i+2] == ['d','-']:
                cnt += 1
                i += 2
            elif i <= len(n)-3 and n[i:i + 3] == ['d','z','=']:
                cnt += 1
                i += 3
            else:
                i += 1
                cnt += 1

        elif n[i] in ['c','s','z']:
            if i <= len(n)-2 and n[i+1] == '=':
                cnt += 1
                i += 2
            elif i <= len(n)-2 and n[i:i+2] == ['c','-']:
                cnt += 1
                i += 2
            else:
                cnt += 1
                i += 1

        else:       # l,n 의 경우
            if i <= len(n)-2 and n[i+1] == 'j':
                cnt += 1
                i += 2
            else:
                cnt += 1
                i += 1

    else:
        i += 1
        cnt += 1

print(cnt)

