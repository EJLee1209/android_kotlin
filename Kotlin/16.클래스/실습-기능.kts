class FootballPlayer(var uniform: String, var ball: String){

    fun kick(){
        println("슛!")
    }
    fun pass(){
        println("패스!")
    }
}
val player1 = FootballPlayer("유니폼1","공1")
player1.kick()
player1.pass()