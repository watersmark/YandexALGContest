class StackSet:

    def __init__(self):
        self.items = []
        self.sets = set()

    def push(self, item):

        if item in self.sets:
            pass
        else:
            self.items.append(item)
            self.sets.add(item)

    def pop(self):
        if len(self.items) == 0:
            print("error")
        else:
            self.sets.remove(self.items[len(self.items) - 1])
            self.items.pop()


    def peek(self):
        if len(self.items) == 0:
            print("error")
        else:
            print(self.items[len(self.items) - 1])

    def size(self):
        print(len(self.items))


count = int(input())
stack = StackSet()

for i in range(count):
    command = input().split(" ")

    if command[0] == "pop":
        stack.pop()
    if command[0] == "peek":
        stack.peek()
    if command[0] == "size":
        stack.size()
    if command[0] == "push":
        stack.push(command[1])
