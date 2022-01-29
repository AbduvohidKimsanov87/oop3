fun main() {
    val cow=Cow("ola",7)
    cow.eat()
    cow.run()


}
interface animalInterface{
    fun eat()
    fun walk()
    fun run()
    fun milk()

}
class Cow(val name:String,val age:Int):animalInterface{
    override fun eat(){
        println("Cow eating flowers")
    }

    override fun walk() {
        println("Sigir often walk")
    }

    override fun run() {
        println("Sigir want to run every day")
    }

    override fun milk() {
        TODO("Not yet implemented")
    }
}