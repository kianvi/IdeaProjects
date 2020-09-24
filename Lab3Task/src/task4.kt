import java.util.*
import kotlin.math.sqrt

fun main() {
    val reader = Scanner(System.`in`)
    var deg: Double = reader.nextDouble()
    var min: Double = reader.nextDouble()
    var sec: Double = reader.nextDouble()

    val newdeg = deg + (min + sec/60)/60

    val rad = newdeg * Math.PI / 180
    println(rad)
}