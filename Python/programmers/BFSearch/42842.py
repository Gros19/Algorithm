def solution(brown, yellow):
    ab = brown + yellow

    sq = int(ab ** 0.5) + 1

    for b in range(1, sq):
        if ab % b == 0:
            a = ab / b

            if a >= b:
                if 2*a + 2*b == brown + 4:
                    return [int(a), int(b)]

print(solution(10,2))

print(2 ** 0.5)
