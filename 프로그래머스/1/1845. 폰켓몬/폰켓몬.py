def solution(nums):
    cnt = len(nums)//2
    return cnt if len(set(nums)) >= cnt else len(set(nums))