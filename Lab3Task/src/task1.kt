fun main(args: Array<String>){
    var rnd = (31..133).random()
    println(rnd.toChar())
    if (rnd.toChar().isDigit())
        println("This is a digit")
    else if (rnd.toChar().isLetter())
        println("This is a letter")
    else
        println("This is a symbol")

}