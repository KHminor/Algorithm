p,w = map(int,input().split())
st = input()
phone = [
    [" "], 
    ["A","B","C"], 
    ["D","E","F"], 
    ["G","H","I"], 
    ["J","K","L"], 
    ["M","N","O"], 
    ["P","Q","R","S"], 
    ["T","U","V"], 
    ["W","X","Y","Z"]
    ]

before = ""
result = 0
for i in st:
    if i == " ": 
        result += p
        before = ""
        continue
    for j in range(9):
        if i in phone[j]:
            num = (phone[j].index(i)+1)*p
            if before == j: result += (num+w)
            else: result += num
            before = j
            break
print(result)