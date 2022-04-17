val number: Int? = null // nullable
//val number2: Int = null // non-null

val number2 : Int? = 2 + 5
val number3 : Int? = 10

val number4 : Int? = number2!! + number3!! //에러 -> number2와 number3가 nullable이므로 (!!로 해결가능)
println(number4)

// !!로 null이 아님을 개발자가 보장 할 수 있다
// 하지만 실제로 null인 경우에는 NPE(NullPointException) 발생
// 100%가 아닌 이상 사용하지 말자

if(null == 5){ // == 비교연산은 가능하다
    println("same")
}
else{
    println("not same")
}
if(null == null){ // == 비교연산은 가능하다
    println("same")
}
else{
    println("not same")
}

