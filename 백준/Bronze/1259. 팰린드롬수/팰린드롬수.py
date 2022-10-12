import sys
while True:
    line = sys.stdin.readline().rstrip('\n')
    if line == '0': break
    ln = len(line)//2
    result = ''
    if len(line)%2:     # 홀수
        for i in range(1,ln+1):
            if line[ln-i] != line[ln+i]:
                result = 'no'
                break
        if result == 'no':
            print('no')
        else:
            print('yes')


    else:
        if ln == 1:
            if line[0] != line[1]:
                result = 'no'

        else:
            for i in range(ln//2+1):
                if line[ln-1-i] != line[ln+i]:
                    result = 'no'
                    break
        if result == 'no':
            print('no')
        else:
            print('yes')