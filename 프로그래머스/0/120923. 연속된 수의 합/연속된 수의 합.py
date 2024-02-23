def solution(num, total):
    answer = []
    moc = total//num
    if total%num:
        for i in range(num//2):
            answer.append(moc-i)
            answer.append(moc+i+1)
    else:
        for i in range(num//2+1):
            answer.append(moc-i)
            if i != 0: answer.append(moc+i)
            
    return sorted(answer)