import sys
input = sys.stdin.readline

word = [input().rstrip('\n') for _ in range(int(input()))]
result = 0
while len(word) != 0:
    result += 1
    a = word.pop(0)
    a = a+a
    li = []
    for i in range(len(word)):
        i_ln = len(word[i])
        if len(a)//2 == i_ln:
            for j in range(i_ln+1):
                if "".join(a[j:j+i_ln]) == word[i]: 
                    li.append(word[i])
                    break
    for i in li: word.remove(i)
print(result)