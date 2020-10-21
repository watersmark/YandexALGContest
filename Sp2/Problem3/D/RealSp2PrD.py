# Вместимость рюкзака
import operator



# Размер предметов
count = int(input())

# count
counter = int(input())

mass = []

# elem[0] - стоимость
# elem[1] - вес

index = 0
for _ in range(counter):
    elem = input().split()
    mass.append([int(elem[0]), int(elem[1]), index])
    index += 1

# b = sorted(sorted(mass, key=lambda x: x[0]), key=lambda x: x[1], reverse=True)
# mass.sort(key= lambda x: (x[0], x[1]), reverse=True )
mass.sort(key=lambda x: (x[0], x[1]))

#print(mass)
sets = set()
massDigit = []

step = len(mass) - 1
while True:
    #print("Now" + str(i))
    if(mass[step][2] not in sets):
        if(step > 0):
            if mass[step][1] <= count:
                if (mass[step][0] != mass[step - 1][0]) or (mass[step - 1][2] in sets):

                    massDigit.append(mass[step][2])

                    count -= mass[step][1]
                    step -= 1
                else:
                    tempStep = step - 1
                    while True:
                        if(tempStep != 0):

                            if ((mass[tempStep][0] == mass[tempStep - 1][0]) and mass[tempStep - 1][2] not in sets):
                                tempStep -= 1
                            else:
                                massDigit.append(mass[tempStep][2])

                                count -= mass[tempStep][1]

                                sets.add(mass[tempStep][2])
                                break

                        else:
                            massDigit.append(mass[tempStep][2])

                            count -= mass[tempStep][1]

                            sets.add(mass[tempStep][2])
                            break
            else:
                step -= 1
        else:
            if(mass[step][1] <= count):
                massDigit.append(mass[step][2])
            break

    else:
        step -= 1


massDigit.sort()
for elem in massDigit:
    print(elem, end=" ")
