A_list = []
N = int(input())
for i in range(0, N):
    A = str(input())
    A_list.append(A)
A_list = list(set(A_list))
A_list.sort()
A_list.sort(key=len)
for i in A_list:
    print(i)