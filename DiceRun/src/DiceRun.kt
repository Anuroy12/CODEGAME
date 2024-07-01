//Assignment number -1 (DiceRun)

fun main(){
    print("hello! \n Please enter your name:")
    val userName= readLine()

    println("hello $userName! Welcome to the world of DiceRun. ")
    println("\t\tReady to try your luck")
    var randomNumber=(1..6)
    var diceNumber=randomNumber.random()
    println("your dice is rolling... ")
    Thread.sleep(3000)
    println("So the number thrown by $userName is $diceNumber")


}