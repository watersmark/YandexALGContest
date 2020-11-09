# Класс для создания узла

class Node:

    # Constructor, который присваивает аргумент значению

    def __init__(self, value):
        self.value = value

        self.next = None

    # Этот метод возвращает строковое представление объекта.

    def __str__(self):
        return "Node({})".format(self.value)

    # __repr__ совпадает с __str__

    __repr__ = __str__


class Stack:

    # Конструктор стека инициализирует вершину стека и счетчик.

    def __init__(self):

        self.top = None

        self.count = 0

        self.maximum = None

    # Этот метод возвращает строковое представление объекта (стека).

    def __str__(self):

        temp = self.top

        out = []

        while temp:
            out.append(str(temp.value))

            temp = temp.next

        out = '\n'.join(out)

        return ('Top {} \n\nStack :\n{}'.format(self.top, out))

    # __repr__ совпадает с __str__

    __repr__ = __str__

    # Этот метод используется для получения минимального элемента стека
    def getMax(self):

        if self.top is None:
            print("None")
            # return "Stack is empty"

        else:
            print(self.maximum)

    # Метод проверки, является ли стек пустым или нет

    def isEmpty(self):

        # Если top равен None, то стек пуст

        if self.top == None:

            return True

        else:

            # Если top не равен None, то стек пуст

            return False

    # Этот метод возвращает длину стека

    def __len__(self):

        self.count = 0

        tempNode = self.top

        while tempNode:
            tempNode = tempNode.next

            self.count += 1

        return self.count

    # Этот метод возвращает вершину стека

    def peek(self):

        if self.top is None:

            print("Stack is empty")

        else:

            if self.top.value > self.maximum:

                print("Top Most Element is: {}".format(self.maximum))

            else:

                print("Top Most Element is: {}".format(self.top.value))

    # Этот метод используется для добавления узла в стек

    def push(self, value):

        if self.top is None:

            self.top = Node(value)

            self.maximum = value

        elif value > self.maximum:

            temp = (2 * value) - self.maximum

            new_node = Node(temp)

            new_node.next = self.top

            self.top = new_node

            self.maximum = value

        else:

            new_node = Node(value)

            new_node.next = self.top

            self.top = new_node

        # print("Number Inserted: {}".format(value))

    # Этот метод используется, чтобы вытолкнуть вершину стека

    def pop(self):

        if self.top is None:
            print("error")

        else:

            removedNode = self.top.value

            self.top = self.top.next

            if removedNode > self.maximum:

                # print("Top Most Element Removed :{} ".format(self.maximum))

                self.maximum = ((2 * self.maximum) - removedNode)

            else:
                pass
                # print("Top Most Element Removed : {}".format(removedNode))


count = int(input())
classStack = Stack()

for i in range(count):
    command = input().split(" ")

    if command[0] == "get_max":
        classStack.getMax()
    if command[0] == "pop":
        classStack.pop()
    if command[0] == "push":
        classStack.push(int(command[1]))
