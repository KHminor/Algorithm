a,b = 0,0
n = int(input())
for i in list(input()):
    if i == "A": a += 1
    else: b += 1

if a == b: print("Tie")
elif a > b: print("A")
else: print("B")