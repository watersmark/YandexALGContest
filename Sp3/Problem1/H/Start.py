# Кол-во пар
countPair = int(input())

# Массив пар
pairMap = list()

# Считывем пары
for elem in range(countPair):
    pairMap.append([int(i) for i in input().split()])

# отсортировали массив
pairMap.sort(key=lambda x: x[0])

# Позиция где мы находимся
posNow = 0
stepNow = 0

for elem in pairMap:

    # # Мы никуда не сдвигаемся, если концы остались такие же
    # # Так же является особым случаем для первого массива
    # if pairMap[posNow][1] == elem[1]:
    #     stepNow += 1
    #     continue
    if stepNow == 0:
        stepNow += 1
        continue

    # Если элемент расширяет границу
    # То добавим его конец к самому начальному и получим
    # Наибольшую границу
    if pairMap[posNow][1] >= elem[0]:
        if pairMap[posNow][1] < elem[1]:
            pairMap[posNow][1] = elem[1]

    else:  # Если цепочка прервалась напечатаем, что было получено ранее
        print(str(pairMap[posNow][0]) + " " + str(pairMap[posNow][1]))
        posNow = stepNow


    # Случай выхода из цикла
    # Не забудем напечатать последнюю пару
    if stepNow + 1 == len(pairMap):
        print(str(pairMap[posNow][0]) + " " + str(pairMap[posNow][1]))

    stepNow += 1

