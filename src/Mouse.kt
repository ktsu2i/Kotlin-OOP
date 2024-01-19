class Mouse(_name: String = "The mouse"): Animal(_name) {
    private var cheeseAmount: Int = 0

    override fun makeASound() {
        squeak()
    }

    private fun squeak() {
        println("$animalName said squeak!")
    }

    fun stealCheese(x: Int) {
        cheeseAmount += x
    }

    fun eatCheese() {
        cheeseAmount--
    }
}