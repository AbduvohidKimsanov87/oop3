fun main() {
    val triangle=Triangle()
    triangle.draw()
    triangle.calculateArea()

}
abstract class Shape(){
    open fun calculateArea(){
        println("Calculating area")
    }
    abstract fun draw()
}
class Triangle():Shape(){
    override fun draw() {
        println("Drawing triangle")
    }
}
