def solution(phone_book):
    phone_book.sort()

    answer = True

    phone_length = len(phone_book)

    for i in range(phone_length-1):
        if phone_book[i] == phone_book[i+1][0:len(phone_book[i])]:
            answer = False
            break

    return answer

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
