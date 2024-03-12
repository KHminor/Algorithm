from datetime import datetime

def solution(a, b):
    weekend = ["SUN","MON","TUE","WED","THU","FRI","SAT"]
    return weekend[(datetime.strptime("2016-%d-%d"%(a,b),"%Y-%m-%d").weekday()+1)%7]