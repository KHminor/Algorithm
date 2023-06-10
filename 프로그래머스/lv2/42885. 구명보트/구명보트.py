def solution(people, limit):
    answer = 0
    people.sort()
    l = len(people)
    big = 1
    small = 0

    while big+small <= l :
        thisboat = 0 
        possible = limit

        while big+small <= l and possible >= people[big*(-1)] :
            thisboat += people[big*(-1)]
            possible = limit - thisboat
            big += 1

        while big+small <= l and possible >= people[small] :
            thisboat += people[small]
            possible = limit - thisboat
            small += 1

        answer += 1
        thisboat = 0

    return answer