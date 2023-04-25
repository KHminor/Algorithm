ln = int(input())
li = list(map(int,input().split()))
mx = max(li)
hap = 0

for i in li:
  hap += i/mx*100

print(hap/ln)