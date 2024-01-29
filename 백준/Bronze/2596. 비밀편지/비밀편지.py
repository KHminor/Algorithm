import sys
input = sys.stdin.readline
n = int(input())
st = input().rstrip('\n')
dic = {
    "000000": "A",
    "001111": "B",
    "010011": "C",
    "011100": "D",
    "100110": "E",
    "101001": "F",
    "110101": "G",
    "111010": "H"
}

result = ""
for i in range(n):
    new = st[i*6:i*6+6]
    fnd = dic.get(new)
    if dic.get(new): result += fnd
    else:
        state = False
        for j in dic.keys():
            cnt = 0
            for k in range(6):
                if new[k] != j[k]: cnt += 1
            if cnt == 1:
                state = True 
                result += dic[j]
                break
        if state == False:
            print(i+1)
            sys.exit(0)

print(result)