for(value in 0..3){
    println("반복1")
}

// progression + step
for(value in 0..5 step 2){
    println("반복2")
}
// progression + downTo
for(value in 5 downTo 0){
    println("반복${value}")
}

val numbers = listOf<Int>(0,1,2,3)
for(number in numbers){
    println(number)
}

for(i in 0 until numbers.size){
    println(numbers[i])
}

for((index, number) in numbers.withIndex()){
    println(""+index+"  |  " + number)
}


//foreach
//numbers.forEach{
//    number->
//    println(number)
//}
numbers.forEach{
    println(it)
}


