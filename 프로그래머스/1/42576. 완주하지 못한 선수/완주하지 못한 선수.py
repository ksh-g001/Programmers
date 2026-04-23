def makeParticipantMap(participant):
    participantMap = {}
    for p in participant:
        participantMap[p] = participantMap.get(p, 0) + 1
    return participantMap

def makeParticipantSet(participant):
    return set(participant)

def solution(participant, completion):
    answer=''
    participantMap = makeParticipantMap(participant)
    participantSet = makeParticipantSet(participant)

    for c in completion:
        participantMap[c] = participantMap.get(c, 0) - 1
        if(participantMap[c] == 0):
            participantSet.discard(c)

    answer = next(iter(participantSet))
    return answer