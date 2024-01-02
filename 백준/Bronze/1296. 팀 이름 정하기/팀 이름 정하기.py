import sys
import copy
input = sys.stdin.readline

def find(name, dic):
    for i in name:
        if i == 'L': dic[0]+=1
        elif i == 'O': dic[1]+=1
        elif i == 'V': dic[2] += 1
        elif i == 'E': dic[3] += 1
    return

yeon = input().rstrip('\n')
dic = [0, 0, 0, 0]
find(yeon,dic)

n = int(input())
name_li = sorted([input().rstrip('\n') for _ in range(n)])
result,idx = 0,0
for x in range(n):
    new_dic = copy.deepcopy(dic)
    find(name_li[x],new_dic)
    gob = 1
    for i in range(3):
        for j in range(i+1,4):
            gob *= (new_dic[i]+new_dic[j]) 
    if gob%100 > result:
        result = gob%100
        idx = x
print(name_li[idx])