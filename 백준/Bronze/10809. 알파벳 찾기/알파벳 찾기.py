alpha_li = [chr(i) for i in range(97,123)]
ch_li = [-1]*26
ip = list(input())
for i in range(len(ip)):
    for j in range(26):
        if ip[i] == alpha_li[j] and ch_li[j] == -1:
            ch_li[j] = i

print(*ch_li)