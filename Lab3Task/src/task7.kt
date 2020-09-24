import java.util.*
import kotlin.math.sqrt

fun main() {
    val reader = Scanner(System.`in`)
    var h1: Int = reader.nextInt()
    var m1: Int = reader.nextInt()
    var h2: Int = reader.nextInt()
    var m2: Int = reader.nextInt()

    val t1 = h1 * 60 + m1
    val t2 = h2 * 60 + m2
    val ans = t2-t1
    println(ans)
}