//계산기1
//- 사칙연산에 대응하는 4개의 함수 구현
//- 연산이 한번 이루어 질 때마다 출력을 해야한다
// (사칙 연산에 대응하는 4개의 함수에서 출력을 하면 안된다)
class Calculater1(){
    var result = 0
        set(value) {
            field = value
            println("중간 계산 값: ${field}")
        }
    fun plus(inputNumber: Int){
        result += inputNumber
    }
    fun minus(inputNumber: Int){
        result -= inputNumber
    }
    fun divide(inputNumber: Int){
        result /= inputNumber
    }
    fun multiply(inputNumber: Int){
        result *= inputNumber
    }
}

val cal1 = Calculater1()
cal1.plus(10)
cal1.multiply(20)
cal1.divide(2)
cal1.minus(10)

//계산기2
//- 사칙연산을 할 수 있는 1개의 함수 구현
// ex) calculater.calculate('+',10)
// ex) calculater.calculate('-',50)
// -초기값을 할당 할 수 있어야 하며 초기 값을 할당하지 않은 경우에는 0을 기본값으로 사용한다
// - 불가능한 연산을 요청한 경우 "잘못된 연산 입니다."를 출력
class Calculater2(val initNumber : Int = 0){
    var result = 0
        set(value) {
            field = value
            println("연산결과 : ${field}")
        }
    init{
        this.result = initNumber
    }

    fun calculate(operater: Char, inputNum: Int){
        when(operater){
            '+' -> result+=inputNum
            '-' -> result-=inputNum
            '/' -> result/=inputNum
            '*' -> result*=inputNum
            else -> println("잘못된 연산 입니다.")
        }
    }
}

val cal2 = Calculater2()
println(cal2.result)
cal2.calculate('+',10)
cal2.calculate('*',2)
cal2.calculate('/',2)
cal2.calculate('-',10)

//계산기3
// - 사칙연산을 할 수 있는 1개의 함수 구현
// - 한번에 여러개의 연산을 입력 받을 수 있어야한다.
// ex) 더하기3 더하기5 나누기10 곱하기2
// ex) calculater.calculate(더하기3, 더하기5, 빼기2, 나누기5)
class Calculater3(){
    var result = 0
    fun calculate(operators: List<Char>, inputNumbers: List<Int>){
        operators.forEachIndexed { index, operator ->
            this._calculate(operator, inputNumbers[index])
        }

    }

    fun _calculate(operater: Char, inputNum: Int){ // 함수 앞의 _는 클래스 내부에서만 사용하자는 개발자끼리의 암묵적인 룰
        when(operater){
            '+' -> result+=inputNum
            '-' -> result-=inputNum
            '/' -> result/=inputNum
            '*' -> result*=inputNum
            else -> println("잘못된 연산 입니다.")
        }
    }
}
//['+','-','*'][10,20,30]
//[(+,10),(-,10),(*,20),(/,3)]
val calculater3 = Calculater3()
calculater3.calculate(listOf<Char>('+','*','/'), listOf<Int>(10,20,3))
println(calculater3.result)
