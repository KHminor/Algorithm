def solution(nums):
    cnt = len(nums)//2
    return min(cnt,len(set(nums)))