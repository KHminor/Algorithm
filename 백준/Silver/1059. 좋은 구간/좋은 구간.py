import sys
input = sys.stdin.readline

L = int(input())
S = list(map(int,input().split()))
n = int(input())
S.append(0)
S.sort()


for i in range(len(S)-1):
    if S[i] == n or n == S[i+1]:
        print(0)
        break
    elif S[i] <= n <= S[i+1]:
        print((n-S[i])*(S[i+1]-n)-1)
        break