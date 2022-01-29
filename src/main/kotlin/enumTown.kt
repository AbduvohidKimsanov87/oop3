fun main() {
    val malumot=Town("Pahtaobod",Street.VAFO,SchoolName.MAKTAB1)
    println(malumot)
}
data class Town(val name:String, val nameStreet: Street, val shcool: SchoolName){
    override fun toString(): String {
        return "Town(town=$name, nameStreet=$nameStreet school name ${shcool.izoh})"
    }
}


enum class Street{
    VAFO,
    ZIROATCHI,
    NOZIKTAB
}
enum class SchoolName(val izoh:String){
    MAKTAB1("ottiz sakkiz"),
    MAKTAB2("ottizbesh"),
    MAKTAB3("ottizolti")
}