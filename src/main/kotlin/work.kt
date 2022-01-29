fun main() {
    val day=DAYS.MONDAY
    println(day.isWeekend)
}
interface Work{
    fun doWork()
}
enum class DAYS(val isWeekend:Boolean=false):Work{
    SUNDAY(true) {
        override fun doWork() {
            println("To day is  weekend so I don`t work")
        }
    },
    MONDAY{
        override fun doWork() {
            println("I go to work")
        }
    },
    TEUSDAY{
        override fun doWork() {
            println("I go to work")
        }
    },
    WEDNESDAY{
        override fun doWork() {
            println("I go to work")
        }
    },
    THURSDAY{
        override fun doWork() {
            println("I go to work")
        }
    },
    FRIDAY{
        override fun doWork() {
            println("I go to work")
        }
    },
    SATURDAY(true){
        override fun doWork() {
            println("To day is  weekend so I don`t work")
        }
    };
    companion object{
        fun isWeekend(day:DAYS)=day.name==SUNDAY.name || day.name==SATURDAY.name
    }
}
