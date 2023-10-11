import sys
input = sys.stdin.readline
hap1,hap2 = 0.0,0.0
_dic = {'A+': 4.5, 'A0': 4.0, 'B+': 3.5, 'B0': 3.0, 'C+': 2.5, 'C0': 2.0, 'D+': 1.5, 'D0': 1.0, 'F': 0.0}
for i in range(20):
    subject = list(input().rstrip('\n').split())
    if subject[-1] == 'P': continue
    hap1 += float(subject[1])*_dic[subject[-1]]
    hap2 += float(subject[1])
if hap1 == 0.0 or hap2 == 0.0: print('0.000000')
else: print(round(hap1/hap2,6))