class Dog:
    def __init__(self, name, breed):
        self.name = name
        self.breed = breed
        self.sound = "woof"

    def default_sound(self):
        print(f"Here is a sound of a dog: {self.sound}")

    def set_sound(self):
        self.sound = input(f"Give the sound for {self.breed}: ")
        print(f"{self.breed} makes this sound: {self.sound}")

dogs = []
dogs.append(Dog("Fixy", "pomeranian"))
dogs.append(Dog("Dobbie", "dobermann"))
dogs.append(Dog("Bluey", "husky"))

for dog in dogs:
    print(dog.name, dog.breed)

dog.default_sound()

for dog in dogs:
    dog.set_sound()
