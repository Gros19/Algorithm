def solution(participant, completion):
    participant.sort()
    completion.sort()

    size = len(completion)

    for i in range(size):
        if(participant[i] == completion[i]):
            pass
        else:
            return participant[i]
    return participant[size]