req = input().upper()
dic = {i:0 for i in set(req)}
for i in req:
  dic[i] += 1

if list(dic.values()).count(max(list(dic.values()))) > 1:
  print('?')
else:
  for i in list(dic.keys()):
    if max(list(dic.values())) == dic.get(i):
      print(i)