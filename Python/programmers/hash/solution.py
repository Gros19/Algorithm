def solution(participant, completion):
    tmp = 0
    dic = {}

    for p in participant:
        dic[hash(p)] = p
        tmp += int(hash(p))

    for com in completion:

        tmp -= hash(com)

    return dic[tmp]

9
5
4
7
2
3

2
3
4
5
9
3
