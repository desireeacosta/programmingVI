class PersonComponent:
    def get_info(self):
        pass

class PersonConcrete(PersonComponent):
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def get_info(self):
        return f"Name: {self.name}, Age: {self.age}"

class PersonDecorator(PersonComponent):
    def __init__(self, component):
        self.wrappee = component

    def get_info(self):
        return self.wrappee.get_info()

class HighSchoolDecorator(PersonDecorator):
    def __init__(self, component):
        super().__init__(component)

    def get_info(self):
        return f"{super().get_info()}, Graduation year: 2020"

class ProfessionDecorator(PersonDecorator):
    def __init__(self, component):
        super().__init__(component)

    def get_info(self):
        return f"{super().get_info()}, Profession: Lawyer"

person = HighSchoolDecorator(ProfessionDecorator(PersonConcrete("Paz", 30)))
print(person.get_info())

person2 = ProfessionDecorator(PersonConcrete("Javier", 29))
print(person2.get_info())
