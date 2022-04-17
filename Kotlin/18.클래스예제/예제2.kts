class User(val name: String){
    var state = false

}
class Game{
    fun login(user: User){
        println("${user.name}님이 게임에 접속했습니다.")
        user.state = true
    }
    fun logout(user: User){
        println("${user.name}님이 로그아웃 했습니다.")
        user.state = false
    }
}

val user1 = User("이은재")
val game = Game()
game.login(user1)
println(user1.state)
game.logout(user1)
println(user1.state)