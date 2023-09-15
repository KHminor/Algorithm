import sys
import re
input = sys.stdin.readline

ch = ['A','B','C','D','E','F']
ch2 = ['A','F','C']

for _ in range(int(input())):
    chromosome = input().rstrip('\n')
    pattern = "[A-F]?A+F+C+[A-F]?$"
    if re.match(pattern,chromosome): print('Infected!')
    else: print('Good')