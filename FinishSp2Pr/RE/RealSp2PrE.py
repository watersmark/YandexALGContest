countChild = input()
# Кол-во жадности детей
factorZhadnost = [int(item) for item in input().split()]

countCookie = input()
# Кол-во размеров печенек
sizeCookie = [int(item) for item in input().split()]

resCount = 0
for reb in factorZhadnost:
    if reb in sizeCookie:
        resCount += 1


print(resCount)