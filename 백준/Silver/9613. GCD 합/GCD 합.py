# GCD = Greatest Common Divisor = 최대공약수

def GCD(a,b):
    while b != 0:
        a,b = b,a%b
    return a
import sys
input = sys.stdin.readline
for _ in range(int(input())):
    li = list(map(int,input().rstrip('\n').split()))
    result = 0
    for i in range(1,li[0]+1):
        for j in range(i+1,li[0]+1): result += GCD(li[i],li[j])
    print(result)