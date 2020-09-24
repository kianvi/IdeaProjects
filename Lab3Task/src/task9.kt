import java.util.*

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)
    var num: Int = reader.nextInt()
    var reversed = 0

    while (num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }

    println(reversed)
}