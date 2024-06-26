def solution(myString, pat):
    myString = "".join(['B' if i == 'A' else 'A' for i in myString])
    return 1 if myString.find(pat) != -1 else 0