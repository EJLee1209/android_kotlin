//1. 주어진 문자를 N번 반복해서 출력하는 함수
val STR = "안녕하세요"
val N = 5
for(i in 1..N){
    println(STR)
}

//2. 1부터 주어진 숫자까지의 합을 구하는 함수
fun sum(num: Int): Int{
    var result = 0
    for(i in 1..num)
        result += i
    return result
}
println(sum(3))

//3. 1부터 100까지의 수중에서 7의 배수의 합을 구하는 함수
fun sumSevenMultiple(): Int{
    var result = 0
    for(i in 1..100){
        if(i % 7 == 0)
            result += i
    }
    return result
}
println(sumSevenMultiple())
//4. 100보다 작은 숫자를 넣어주면, 1씩 증가를 시키고 100이 되면 종료되는 함수
fun putNumber(num: Int){
    var number = num
    if(num >= 100) return
    for(i in num..100){
        println(number)
        number++
    }
}
putNumber(98)
//5. 시험 성적 리스트 [70, 71, 72, 77, 78, 79, 80, 82, 90, 99]
//와 동일한 크기가 같은 배열을 만들고, 합격이면 true, 불합격이면 false를 담는 함수
fun passOrFail(examScores: List<Int>): BooleanArray{
    val resultArray = BooleanArray(examScores.size, {false})
    examScores.forEachIndexed { index, score ->
        if(score >= 80) resultArray[index] = true
    }
    return resultArray
}

val scores = listOf<Int>(70, 71, 72, 77, 78, 79, 80, 82, 90, 99)
val result = passOrFail(scores)
result.forEach {
    println(it)
}
//6. 두개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 함수
//  -> [[3,3],[1,5]...]
fun twoDiceSumSix(): List<List<Int>>{
    val resultList = mutableListOf<List<Int>>()
    for(i in 1..6){
        for(j in 1..6){
            if(i+j == 6){
                resultList.add(listOf<Int>(i,j))
            }
        }
    }
    return resultList
}
println(twoDiceSumSix())

//7. 배부르기 위해서 남은 밥먹기 횟수, 현재 밥먹은 횟수, 두개를 받는 함수를 만드시오
//  함수는 "밥을 먹었다" 한번 출력을 할 때 마다 밥을 1회 먹은 것으로 간주하고,
//  배가 부를 때까지 밥을 먹여야 한다.
//  배가 부를 경우에는 "배가 부르다" 를 출력한다
//  배가 아무리 불러도 최소 한번은 무조건 먹는다

fun eatFoodToFull(leftEatNumber: Int, presentEatNumber: Int){
    var left = leftEatNumber
    var present = presentEatNumber
    do{
        println("밥을 먹었다")
        present++
    }while(left < present)
    println("배부르다")
}

eatFoodToFull(2,1)

//8. 병사 그룹 2개와 n번째 값을 넣어주면, 각각의 병사 그룹에서 n번째 병사를 제거하고, 두개의 병사
//  그룹을 합쳐주는 함수를 만드시오.
fun mergeGroup(soldier1: List<String>, soldier2: List<String>, num: Int): List<List<String>>?{
    if(soldier1.size < num || soldier2.size < num) return null
    val group1 = soldier1.toMutableList()
    val group2 = soldier2.toMutableList()

    val mergeList = mutableListOf<List<String>>()
    group1.removeAt(num)
    group2.removeAt(num)
    mergeList.add(group1)
    mergeList.add(group2)

    return mergeList
}

println(mergeGroup(listOf("A","B","C","D","E"), listOf("A","B","C"),2))

//9. 구구단의 단수를 입력 받아 해당 단수의 값을 리스트로 출력하는 함수
fun gugudan(dan: Int): List<Int>{
    val resultList = mutableListOf<Int>()
    for(i in 1..9){
        resultList.add(dan*i)
    }
    return resultList
}
println(gugudan(3))

//10. 숫자 리스트 두개를 넣어주면 짝수와 홀수로 분리된 Map을 만드는 함수
//(map의 키는 짝수의 경우 "짝수", 홀수의 경우 "홀수" 한다)

fun splitNumbers(firstIntList : List<Int>, secondIntList : List<Int>): Map<String, List<Int>>{
    val result = mutableMapOf<String,List<Int>>()
    val totalIntList = mutableListOf<Int>()
    totalIntList.addAll(firstIntList)
    totalIntList.addAll(secondIntList)

    val evenNumber = mutableListOf<Int>()
    val oddNumber = mutableListOf<Int>()

    totalIntList.forEach{
        if(it %2 == 0) evenNumber.add(it)
        else oddNumber.add(it)
    }

    result.put("짝수" , evenNumber)
    result.put("홀수" , oddNumber)

    return result
}

println(
    splitNumbers(
        listOf<Int>(1,2,3,4,5),
        listOf<Int>(6,7,8,9,10)
    )
)

