import sys
input = sys.stdin.readline

for _ in range(int(input())):
    dic = dict()
    mx = 0
    li = list(map(int,input().split()))

    for i in range(1,li[0]+1):
        if dic.get(li[i]): 
            dic[li[i]] += 1
        else: dic[li[i]] = 1
        mx = max(dic[li[i]],mx)
    
    result = 0
    if mx > li[0]//2:
        for i in dic.keys():
            if dic[i] == mx:
                result = i
                break
    else: result = "SYJKGW"
    print(result)