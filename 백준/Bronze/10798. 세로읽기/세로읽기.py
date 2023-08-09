arr = [list(input()) for _ in range(5)]
result = ''
for i in range(15):
    for j in range(5):
        try: result+= arr[j][i]
        except: continue
print(result)