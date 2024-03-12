def solution(cards1, cards2, goal):
    while (cards1 or cards2) and goal:
        if cards1 and goal[0] == cards1[0]:
            print(goal[0],cards1[0])
            del goal[0]
            del cards1[0]
        elif cards2 and goal[0] == cards2[0]:
            print(goal[0],cards2[0])
            del goal[0]
            del cards2[0]
        else: break
    if not goal: return "Yes"
    else: return "No"