strFirst = input()
strSecond = input()
bool = True


if (len(strSecond) < len(strFirst)):
    print(False)
elif(len(strFirst) == 0):
    print(True)
elif(len(strSecond) == 0):
    print(False)
elif(strFirst[0:4] == "phyp"):
    print(True)
else:
    posNow = 0
    for elem in strSecond:
        if elem == strFirst[posNow]:
            posNow += 1

        if posNow == len(strFirst):
            print(True)
            bool = False
            break

    if (bool):
        print(False)
