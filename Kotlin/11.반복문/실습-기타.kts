//val numbers = intArrayOf(5,10,15)
//
//// 값만 필요할 때
//
//for(number in numbers){
//    println(number)
//}
//// 값과 인덱스 모두 필요할 때
//println("---------------")
//for((index, value) in numbers.withIndex()){
//    println("index: ${index}, value: ${value}")
//}
//// 인덱스만 필요할 때
//println("---------------")
//for(index in numbers.indices){
//    println(index)
//}
//println("---------------")
//// 본문에서 사용될 변수 이름을 기본 제공으로 사용
//numbers.forEachIndexed { index, i ->
//    println("index: ${index}, value: ${i}")
//}
//// 본문에서 사용될 변수 이름을 변경해서 사용
//numbers.forEachIndexed { index, value ->
//    println("index: ${index}, value: ${value}")
//}
//
