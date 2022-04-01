from collections import Counter


def solution(clothes):
    var = []
    svar = set()
    answer = 1
    for a in clothes:
        var.append(a[1])
        svar.add(a[1])
    for a in svar:
        answer = (Counter(var)[a]+1)*answer
    return answer-1

print(solution([["yellowhat", "headgear"], ["bluesunglasses", "eyewear"], ["green_turban", "headgear"]]))