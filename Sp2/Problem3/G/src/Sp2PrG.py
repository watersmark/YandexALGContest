m = int(input())
n = int(input())

mass = list()

for i in range(m):
    mass.append(input().split())

# print(mass)

# Показывает направление движения
pos = 1

# Координаты mass[posF][posS]
posF = 0
posS = -1

# Кол-во пройденных элементов
count = n * m

# Стартовое згачеия для m-1
m -= 1
while True:
    if (count == 0):
        break

    # влево -->
    if pos % 4 == 1:
        for i in range(n):
            posS += 1
            print(mass[posF][posS])
            count -= 1

        n -= 1
        pos += 1
        continue

    # вниз
    if pos % 4 == 2:
        for i in range(m):
            posF += 1
            print(mass[posF][posS])
            count -= 1
        m -= 1
        pos += 1
        continue

    # вправо <--
    if pos % 4 == 3:
        for i in range(n):
            posS -= 1
            print(mass[posF][posS])
            count -= 1
        n -= 1
        pos += 1
        continue

    # вверх
    if pos % 4 == 0:
        for i in range(m):
            posF -= 1
            print(mass[posF][posS])
            count -= 1
        m -= 1
        pos += 1
        continue