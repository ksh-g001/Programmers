import math

def solution(progresses, speeds):
    answer = []
    finishdays = []
    

    for i in range(len(progresses)):
        day = math.ceil((100 - progresses[i]) / speeds[i])
        finishdays.append(day)

    cnt = 0
    previous = finishdays[0]

    for d in finishdays:
        if(d <= previous):
            cnt += 1
        else :
            answer.append(cnt)
            cnt = 1
            previous = d

    answer.append(cnt)

    return answer

