import java.lang.IllegalArgumentException

try {
    val numbers = listOf<Int>(1, 2, 3)
    numbers.get(5)
}catch(ex: ArrayIndexOutOfBoundsException){
    println("예외발생 A")
}catch(ex: IllegalArgumentException){
    println("예외발생 B")
}finally{
    println("마지막!")
}