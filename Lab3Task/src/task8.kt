import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    var num: Double = reader.nextDouble()
    var percent: Double = reader.nextDouble()

    percent = 1 + percent / 100
    for (i in 1..3) {
        num *= percent
    }


    println(num)
}