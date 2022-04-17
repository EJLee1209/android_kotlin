//val A : Int = 10
//val B : Int = 20
//val C : Boolean = A == B
//
//println(C)

//val A: Int = 10
//val B: Int = A*2
//println(B)

//fun score(score: Int){
//    if(score >= 90)
//        println("A")
//    else if(score >= 80)
//        println("B")
//    else if(score >= 70)
//        println("C")
//    else
//        println("F")
//}
//
//score(89)

//fun resultScore(answer: Int) : Int{
//    if(answer < 0 || answer > 20)
//        return -1
//    return answer*5
//}
//
//println(resultScore(18))

fun sum(num1: Int?, num2: Int?): Int?{
    if(num1 == null && num2 == null) return 0
    else if(num1 == null) return num2
    else if(num2 == null) return num1
    else return num1 + num2
}

println(sum(null,null))
