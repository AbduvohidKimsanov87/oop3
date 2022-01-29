fun main() {
    val ali=Odamlar("Ali",Gender.MALE) // stringdan ham enum olish mumkin:Gender.valueOf(value:"MALE")
    val Alisa=Odamlar("Alisa",Gender.FEMALE)
    Alisa.gender.doJob()
    println(Alisa)
    ali.gender.doJob()
    println(ali)


}
data class Odamlar(var name:String,var gender:Gender){
    override fun toString(): String {
        return "Odamlar(name=$name, gender=${gender.izoh})"
    }

}
interface Job{
    fun doJob()
}


enum class Gender(val izoh:String):Job{
    MALE("Erkak") {
        override fun doJob() {
            println("Men erkakman mening vazifam o`tin yorihs yer chopish")
        }
    },
    FEMALE("Ayol"){
        override fun doJob() {
            println("Men ayolkishiman meni vazifam uy ishlarini qilish ")
        }
    }
}

