def solution(nums):
    answer = 0
    select = len(nums)//2
    kinds = len(set(nums))
    if select >= kinds:
        answer = kinds
    else:
        answer = select

    return answer