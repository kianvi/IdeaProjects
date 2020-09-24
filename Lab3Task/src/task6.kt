import java.util.*
fun main() {
    val reader = Scanner(System.`in`)
    var x: Int = reader.nextInt()
    val ans = (x / 100) % 10

    println(ans)
}