a,b = input().split()
a_ln,b_ln = len(a),len(b)
result = 50
for i in range(b_ln-a_ln+1):
    cnt = 0
    for j in range(a_ln):
        if a[j] != b[i+j]: cnt += 1
    if result > cnt: result = cnt

print(result)