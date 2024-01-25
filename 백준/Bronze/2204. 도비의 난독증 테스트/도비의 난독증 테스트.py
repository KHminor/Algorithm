import sys
input = sys.stdin.readline
while True:
    n = int(input())
    if not n: break
    dic = dict()
    for _ in range(n):
        st = input().rstrip('\n')
        dic[st] = st.upper()
    li = sorted(dic.values())
    for i in dic.keys():
        if li[0] == dic[i]:
            print(i)
            break