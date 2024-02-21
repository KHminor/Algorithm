n = int(input())
data = list(map(int, input().split()))
cluster = int(input())

result = 0
for i in data :
  if i % cluster > 0 :
    result += i // cluster + 1
  else :
    result += i // cluster

print(cluster * result)