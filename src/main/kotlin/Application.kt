class Application(private val fizzBuzzgenerator: FizzBuzzGenerator) {
    fun run(): String {
        return fizzBuzzgenerator.createString()
    }
}
