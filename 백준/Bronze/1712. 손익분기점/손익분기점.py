fix,vcost,cost = map(int,input().split())
result = 0
if cost > vcost:
    result = fix//(cost-vcost)+1
else:
    result = -1
print(result)
