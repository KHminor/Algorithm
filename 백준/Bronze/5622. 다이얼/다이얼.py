num_li = [[],[],['A','B','C'],['D','E','F'],['G','H','I'],['J','K','L'],
          ['M','N','O'],['P','Q','R','S'],['T','U','V'],['W','X','Y','Z']]

s = list(input())
result = 0
for i in range(len(s)):
    for j in range(len(num_li)):
        if s[i] in num_li[j]:
            result += j+1

print(result)