li = [int(input()) for _ in range(5)]
print(sum([40 if i<40 else i for i in li])//5)