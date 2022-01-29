fun main() {
    val child=Child("Ali",20)
    println(child.vasiyat())
}
abstract class Parent(var name: String, var age:Int){
    fun printMe(){
        println("My name is $name age $age")
    }
    abstract fun vasiyat():String


}
class Child(name: String,age: Int):Parent(name,age){
    override fun vasiyat(): String {
        return "I am childclas and I override the run"
    }
}