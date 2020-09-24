import java.util.*
import kotlin.math.sqrt

fun main(){
    val reader = Scanner(System.`in`)
    var x1:Int = reader.nextInt()
    var y1:Int = reader.nextInt()
    var x2:Int = reader.nextInt()
    var y2:Int = reader.nextInt()

    val dist = sqrt(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)).toDouble())

    println(dist)
}