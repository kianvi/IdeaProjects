import java.time.LocalTime
import java.time.format.DateTimeFormatter

fun main(){
    val time1 = readLine()
    val time2 = LocalTime.parse(time1, DateTimeFormatter.ofPattern("HH:mm:ss"))
    println(time2.toSecondOfDay())



}