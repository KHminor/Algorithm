import sys
input = sys.stdin.readline

while True:
    dic = {chr(i):0 for i in range(97,123)}
    inp = input().rstrip('\n')
    if inp == "#":break
    x,st = inp[0],inp[2:]
    for i in st.lower(): 
        try: dic[i]+= 1
        except: continue
    print(x,dic[x])