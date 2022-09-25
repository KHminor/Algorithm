def selection_sort(cnt,n):
    for i in range(n,0,-1):
        b_idx = i
        for j in range(i-1,-1,-1):
            if arr[j] > arr[b_idx]:
                b_idx = j
        if i != b_idx:
            arr[i], arr[b_idx] = arr[b_idx], arr[i]
            cnt += 1
            if cnt == K:
                print(arr[b_idx],arr[i])
                return
    else :
        print(-1)



A,K = map(int,input().split())
arr = list(map(int,input().split()))
ch_li = sorted(arr[:])

cnt = b_idx = 0
selection_sort(cnt,A-1)