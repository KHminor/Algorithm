d,m = map(int,input().split())
li = [31,28,31,30,31,30,31,31,30,31,30,31]
weekend = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
now = 3
print(weekend[((sum(li[:m-1])+d)%7+now-1)%7])