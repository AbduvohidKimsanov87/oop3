fun main() {
    val sinfdosh1=Sinfdosh("Abduganiy",33,"Taqachi","Driver")
    val sinfdosh2=Sinfdosh("Inomjon",35,"Zelyonnimos","Teach")
    val sinfdosh3=Sinfdosh("Jurabek",32,"Yangi hayot","DriverTruck")
    val sinfdoshRuyhati= arrayOf(sinfdosh1,sinfdosh2,sinfdosh3)
    for (item in sinfdoshRuyhati){
        println(item)
    }

}
data class Sinfdosh(var name:String,var age:Int, var streetName:String,var hobby:String){

}