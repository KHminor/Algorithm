s = input()
ln_s = len(s)
i = 0
result = []
while i != ln_s:
    if s[i] == ".": 
        result.append(".")
        i += 1
    elif s[i:i+4] == "XXXX":
        result.append("AAAA")
        i += 4
    elif s[i:i+3] == "XXX":
        result = ["-1"]
        break
    elif s[i:i+2] == "XX":
        result.append("BB")
        i += 2
    elif s[i:i+1] == "X":
        result = ["-1"]
        break
print("".join(result))
