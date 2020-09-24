import java.util.*

fun main(){
    val reader = Scanner(System.`in`)
    var fathoms:Int = reader.nextInt()
    var arshins:Int = reader.nextInt()
    var vershoks:Int = reader.nextInt()

    val dist = ((fathoms * 48 + arshins * 16 + vershoks) * 4.445).toDouble()

    println(dist)

}