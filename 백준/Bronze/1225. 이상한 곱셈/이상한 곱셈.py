a,b = input().split()
a_ln,b_ln = len(a),len(b)
a,b = int(a),sum([int(i) for i in b])
result = 0

for i in range(a_ln):
    result += b*(a%10)
    a //= 10
print(result)