result = [0,0]
eat,check = True,False
for _ in range(10):
    mushroom = int(input())
    if eat:
        if 100 > result[0] + mushroom: result[0] += mushroom
        elif 100 == result[0] + mushroom: result[0] = 100
        else:
            if check == False:
                result[1] = result[0] + mushroom
                check = True
                eat = False

if abs(100-result[1]) > abs(100-result[0]): print(result[0])
else: print(result[1])