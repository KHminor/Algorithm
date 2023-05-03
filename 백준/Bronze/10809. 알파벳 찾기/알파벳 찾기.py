s = input()
li = {chr(i):-1 for i in range(97,123)}
for i,idx in enumerate(range(len(s))):
    if li[s[i]] == -1:
        li[s[i]] = idx
for i in li.values():
    print(i, end=' ')