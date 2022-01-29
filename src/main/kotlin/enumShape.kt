fun main() {
    val chizma=Shakl("uchburchak",Shape1.SQUARE)
    println(chizma.Shakl.izoh)
}
data class Shakl(val name:String, val Shakl: Shape1){


}
enum class Shape1(val izoh:String) {
    TRIANGLE("uchburchak"),
    SQUARE("kvadrad"),
    CIRCUL("aylana")
}