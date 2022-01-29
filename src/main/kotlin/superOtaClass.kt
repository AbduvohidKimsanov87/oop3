fun main() {
    val grandfather=Grandfather("Abdulloh",98)
    val father1=Father1("Abdurahmon",78)
    val father2=Father2("Abdujalil",75)
    val son=Son("Abdurazzoq",52)
    grandfather.talk()
    son.talk()
    father1.talk()
    father2.walk()
    grandfather.talk()
    // publik-ommviy,hamma bollariga ko`rinadi(talk() larni ishlashi)
    // private-hususiy yozilgan klasdan boshqalariga ko`rinmaydi
    // protected-yozilgan klasdan boshqalari ko`ra oladi holos
    //internel-shu papkani o`zida ko`rinadi boshqa papkada ko`rinmaydi



}
open class Grandfather(val name:String,val age:Int){

    open fun talk(){
        println("Grandfather need to exhort and talking the children")
    }
    fun walk(){
        println("Grandfather want to visit, walking more countries and cities")

    }
}
class Father1(name: String,age: Int):Grandfather(name,age){
    override fun talk() {
        println("Father1 talk every day very much")
    }


}
open class Father2(name: String,age: Int):Grandfather(name,age){

    open fun swim(){
        println("he want to swimming in the ocean")
    }
}
class Son(name: String,age: Int):Father2(name,age){
    override fun talk(){
        println("son too talk")
    }

}