import sys
input = sys.stdin.readline

_dic = { 
'**** ** ** ****':'0', 
'  *  *  *  *  *':'1',
'***  *****  ***':'2',
'***  ****  ****':'3',
'* ** ****  *  *':'4',
'****  ***  ****':'5',
'****  **** ****':'6',
'***  *  *  *  *':'7',
'**** ***** ****':'8',
'**** ****  ****':'9',
}

boom = [input().rstrip('\n') for _ in range(5)]
li = []
for i in range(len(boom)):
    if i == 0: 
        for j in range(0,len(boom[i]),4): li.append(boom[i][j:j+3])
    else: 
        cnt = 0
        for j in range(0,len(boom[i]),4): 
            li[cnt] = li[cnt] + boom[i][j:j+3]
            cnt += 1

result,flag = '', True
for i in range(len(li)): 
    try: result += _dic[li[i]]
    except: 
        print("BOOM!!")
        flag = False
        break

if flag:
    if int(result)%6: print("BOOM!!")   
    else: print("BEER!!")