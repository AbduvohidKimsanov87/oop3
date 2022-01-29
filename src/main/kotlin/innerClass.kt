import OuterClass.InnerClass

fun main() {
    val outerClass=OuterClass()
    val nestedClass=OuterClass.NestedClass()
    val innerClass=outerClass.InnerClass()
}
class OuterClass(){
    private val OuterString="This is the outer string"
    fun printMe(){
        println(OuterString)
    }
    fun callPrintMe(){

    }
//    nested class  outer class ichi da bo`lgani bilan
//    outer classni variable lariga ruhsati yo`q
    class NestedClass(){
        val nestedString="This is nested class string"
        fun printNestedFun(){
            println(nestedString)
        }
    }
//    inner class outer classdagi  propertiesga ruhsati bor hamma fun va variable larni chaqira oladi
    inner class InnerClass(){
        val innerString="This is the inner class string"
        fun callOuterClassfun(){
            println(OuterString)
        }
    }
}