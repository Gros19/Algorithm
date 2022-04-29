def solution(brown, yellow):
    ab = brown + yellow
    for m in range(3, int(ab ** 0.5) + 1):
        if ab % m == 0:
            print(ab // m, m)
            if(2 * ((ab // m) + m - 2) == brown):
                return [ab // m, m]
print(solution(10,2))
