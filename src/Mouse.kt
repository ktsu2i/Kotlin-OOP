class Mouse(_name: String = "The mouse"): Animal(_name) {
    private var CheeseAmount: Int = 0

    override fun makeASound() {
        squeak()
    }

    private fun squeak() {
        println("$animalName said squeak!")
    }

    fun StealCheese(x: Int) {
        CheeseAmount += x
    }

    fun EatCheese() {
        CheeseAmount--
    }
}