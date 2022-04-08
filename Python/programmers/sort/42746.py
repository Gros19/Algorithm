def solution(numbers):

    a = list(map(str, numbers))

    print(sorted(a,reverse=True))
    a.sort(key=lambda x: x*3, reverse=True)
    return str(int(''.join(a)))

print(solution([6, 10, 2]))