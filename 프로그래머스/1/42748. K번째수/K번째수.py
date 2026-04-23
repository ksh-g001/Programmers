def solution(array, commands):
    answer = []
    for command in commands:
        start = command[0] - 1
        end = command[1]
        k = command[2] - 1
        slicedArr = array[start:end]
        sortedArr = sorted(slicedArr)
        answer.append(sortedArr[k])
    return answer