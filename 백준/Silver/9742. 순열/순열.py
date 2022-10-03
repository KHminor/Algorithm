import sys

def nPr(s,n):
    global num
    if ch_li:
        return
    if s == n:
        if num == ch_num:
            ch_li.append(li[:])
            return

        num += 1
    else:
        for i in range(n):
            if not visited[i]:
                visited[i] = 1
                li[s] = num_li[i]
                nPr(s+1,n)
                visited[i] = 0

while 1:
    data = sys.stdin.readline().rstrip().split()
    if len(data) != 2:
        break
    a, b = data
    num_li, ch_num = list(a),int(b)
    n = len(num_li)
    num = 1
    ch_li = []
    visited = [0]*n
    li = [0]*n
    nPr(0,n)

    s = ''
    if num == ch_num:
        for i in ch_li[0]:
            s += i
        print(f'{a} {b} = {s}')
    else:
        print(f'{a} {b} = No permutation')