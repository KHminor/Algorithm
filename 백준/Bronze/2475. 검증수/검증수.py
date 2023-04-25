hap = 0
for i in list(map(int,input().split())):
  hap += i**2
print(hap%10)