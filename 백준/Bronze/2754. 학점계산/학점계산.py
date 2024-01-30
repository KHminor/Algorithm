dic = {"A":4.0, "B":3.0, "C":2.0, "D":1.0, "F":0.0}
score = input()

if score == "F": print(dic[score])
else:
    if score[1] == "+": print(dic[score[0]]+0.3)
    elif score[1] == "0": print(dic[score[0]])
    else: print(dic[score[0]]-0.3)