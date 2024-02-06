sent = input()
result = []
state = False
cnt = 0
for i in range(len(sent)):
    if state: 
        if cnt == 1: 
            state = False
            cnt = 0
        else: cnt += 1
        continue    
    elif sent[i] in {'a','e','i','o','u'}: state = True
    result.append(sent[i])
print("".join(result))