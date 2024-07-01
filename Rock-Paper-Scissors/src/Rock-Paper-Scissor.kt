
public var playerScore=0
public var computerScore=0
fun main(){
    println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t WELCOME TO THE GAME OF ROCK-PAPER-SCISSORS!")
    println("\nPlease enter your name before starting the game:")
    val player1= readln()
    println("HEY $player1 ! \nWelcome to the game of Rock, Paper and Scissors ")
    println("\nThe rules of the games are given below:\n 1. A rock beats scissors, scissors beat paper by cutting it, and paper beats rock by covering it.\n 2. There will overall 3 rounds .\n 3. the one who scored the most will be the winner.")
    var numOfRounds=1
    println("\nLET'S START THE GAME")
    while(numOfRounds<=3){

        Thread.sleep(3000)
        println("\n\t\t\tROUND $numOfRounds")
        val playersInput=playerChoice()
        val computerInput=computerChoice()
        println("$player1's choice: $playersInput")
        println("Computer's choice: $computerInput")
        val result=winner(playersInput,computerInput,player1)
        println("\n\t\t\tSCOREBOARD")
        println("$player1 's Score:$playerScore     Computer's Score:$computerScore")
        numOfRounds++

    }
    println("SO THE FINAL SCORE OF THE ROUNDS ARE...")
    Thread.sleep(2000)
    println("\n\t\t FINAL SCOREBOARD")
    println("$player1's Score:$playerScore     Computer's Score:$computerScore")
    println("THE WINNER OF THE GAME IS....")
    Thread.sleep(3000)
    if (playerScore > computerScore) {
        println("$player1     SCORE: $playerScore")
    } else if (computerScore > playerScore) {
        println("COMPUTER     SCORE:$computerScore")
    } else {
        println("IT'S A DRAW\n $player1 SCORE: $playerScore  Computer SCORE :$computerScore")
    }



}
fun playerChoice(): String {
    println("Enter your choice(ROCK/PAPER/SCISSORS): ")
    val choice= readln()
    return choice
}
fun computerChoice():String{
    val choice= listOf("ROCK","PAPER","SCISSORS")
    val randomChoice=choice.random()
    return randomChoice
}

fun winner(pChoice:String,cChoice:String,pname:String){
    if(pChoice==cChoice){
        println("DRAW!!!!")
    }
    if(pChoice=="ROCK"){
        if(cChoice=="SCISSORS"){
            println("ROCK crushes SCISSORS")
            println("Point to the $pname")
            playerScore++
        }else if(cChoice=="PAPER"){
            println("PAPER covers the ROCK")
            println("Point to the Computer")
            computerScore++
        }
    }else if(pChoice=="PAPER"){
        if(cChoice=="SCISSORS"){
            println("SCISSORS cut the PAPER")
            println("Point to the Computer")
            computerScore++
        }else if(cChoice=="ROCK"){
            println("PAPER covers the ROCK")
            println("Point to the $pname")
            playerScore++
        }
    }else if(pChoice=="SCISSORS"){
        if(cChoice=="ROCK"){
            println("ROCK crushes the SCISSORS")
            println("Point to the Computer")
            computerScore++
        }else if(cChoice=="PAPER"){
            println("SCISSORS cut the PAPER")
            println("Point to the $pname")
            playerScore++
        }
    }else{
        println("Wrong choice select from any of the given option.")
    }


}











































