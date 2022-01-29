fun main() {
    val jasur=Aholi("Jasur",Adress(country =CountryEnum.KIRGIZISTAN , region = RegionEnumKir.JALOLOBOD))
    val tuhtasin=Aholi("Tuxtasin", Adress(country =CountryEnum.UZBEKISTAN, region = RegionEnumUz.ANDIJON) )
    println(jasur)
    println(tuhtasin)
}
data class Aholi(val name:String, val adress: Adress)
data class Adress(val country:CountryEnum,val region:Region)
enum class CountryEnum{
    UZBEKISTAN,
    KIRGIZISTAN,
    KAZAKSTAN
}
interface Region{

}
enum class RegionEnumKir:Region{
    OSH,
    BISHKEK,
    JALOLOBOD
}
enum class RegionEnumUz:Region{
    ANDIJON,
    NAMANGAN,
    FARGONA
}