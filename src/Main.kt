fun main() {
    val dog0: Dog = Dog("Hachiko")
    dog0.move("forward")
    dog0.makeASound()
    // dog0.bark() - doesn't work because bark() is private

    val cat0: Cat = Cat("Tom")
    cat0.move("forward")
    cat0.makeASound()
    // cat0.meow() - doesn't work because meow() is private

    // Can also use Animal (super class)
    // val dog: Animal = Dog("Hachiko")
    // val cat: Animal = Cat("Tom")

    moveAndMakeASound(dog0)
    moveAndMakeASound(cat0)

    // Assignment
    val jerry: Mouse = Mouse("Jerry")
    jerry.makeASound()
    jerry.stealCheese(10)
    jerry.eatCheese()
}

fun moveAndMakeASound(animal: Animal) {
    animal.move("forward")
    animal.makeASound()
}