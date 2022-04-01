def solution(clothes):
    clothesTypeMap = {}
    for clothe, clothesType in clothes:
        print(clothe)
        print("clotheType : " + clothesType)

        clothesTypeMap[clothesType] = clothesTypeMap.get(clothesType, 0) + 1

        print(clothesTypeMap)
    ansewer = 1
    for clothesType in clothesTypeMap:
        ansewer *= (clothesTypeMap[clothesType] + 1)


    return ansewer-1

print(solution([["yellowhat", "headgear"], ["bluesunglasses", "eyewear"], ["green_turban", "headgear"]]))