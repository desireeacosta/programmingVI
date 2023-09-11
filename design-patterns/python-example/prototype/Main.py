import copy

class Prototype:
    def __init__(self):
        self.value = None

    def clone(self):
        return copy.deepcopy(self)

    def get_value(self):
        return self.value

    def set_value(self, value):
        self.value = value

prototype = Prototype()
prototype.set_value(10)

print("Prototype:")
print(prototype.get_value())

first_clone = prototype.clone()

print("First clone:")
print(first_clone.get_value())

second_clone = prototype.clone()

print("Second clone:")
print(second_clone.get_value())