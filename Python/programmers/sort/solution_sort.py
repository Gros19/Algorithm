def solution(array, commandsss):
    answer = []
    for commands in commandsss:
        start = commands[0]
        end = commands[1]
        choice = commands[2]
        list = sorted(array[(start - 1):end])
        answer.append(list[choice-1])
    return answer

print(solution([1, 5, 2, 6, 3, 7, 4], [[2, 5, 3], [4, 4, 1], [1, 7, 3]]))