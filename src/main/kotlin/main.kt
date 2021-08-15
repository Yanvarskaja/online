fun main() {
    var time = 39600
    val name = "Vika"
    val minutes = time / 60
    val hours = time / 3600

    fun agoToText(): String {
        return when (time) {
            in 0..60 -> "$name был(а) в сети только что"
            in 61..3600 -> "$name был(а) в сети $minutes"
            in 3601..86_400 -> "$name был(а) в сети $hours"
            in 86_401..172_800 -> "$name был(а) в сети сегодня"
            in 172_801..259_200 -> "$name был(а) в сети вчера"
            else -> "$name был(а) в сети давно"
        }
    }

    fun correctMinutes(): String {
        return when (minutes) {
            1, 21, 31, 41, 51 -> " минуту назад"
            2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54 -> " минуты назад"
            else -> " минут назад"
        }
    }

    fun correctHours(): String {
        return when (hours) {
            1, 21 -> " час назад"
            2, 3, 4, 22, 23, 24 -> " часа назад"
            else -> " часов назад"
        }
    }

    fun print() = run {
        if (time > 60 && time <= 3600) {
            println(agoToText() + correctMinutes())
        } else if (time > 3600 && time <= 86_400) {
            println(agoToText() + correctHours())
        } else {
            println(agoToText())
        }
    }

    println(print())

    /*
    println (result)
    println(correctMinutes())
    1, 21,31... - минуту назад
    2,3,4, 22,23,24, 33,32,34... - минуты назад
    5-20, 25, 26,27,28,29,30... - минут
    1,21 - час назад
    2,3,4, 22, 23 - часа назад
    5-20 - часов
    */

}


















