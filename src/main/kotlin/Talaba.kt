class Talaba(var name:String,var surname:String,var age:Int,var kurs:Int,var studyPlaces:String) {
    constructor(name: String,surname: String):this(name,surname,24,4,"Andijon")

    fun talk(){
        println("$surname $name gapiryabdi yoshi $age kursi $kurs o`qish joyi $studyPlaces ")
    }
    fun walk(){
        println("$surname $name yuryabdi yoshi $age kursi $kurs o`qish joyi $studyPlaces ")

    }
}