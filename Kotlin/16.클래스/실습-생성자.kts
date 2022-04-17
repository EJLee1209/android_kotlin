// 클래스를 선언하는 방법
class Person{}

// 생성자
// - 주생성자
//  - 클래스 이름 옆에 괄호로 둘러싸인 코드
//  - 클래스를 통해서 객체를 만드는데 필요한 재료들 적어 준다
//      - 재료이름(변수명): 재료타입(변수타입)
//  - 반드시 한개만 존재할 수 있다.
//  - constructor 키워드를 생략할 수 있다.


//주 생성자 -> 풀버젼(생략이 없는 버젼)
class User1 constructor(name: String){
    val name:String // 클래스 속성(프로퍼티, property)은 init블럭에서 초기화 된다.

    init{ //클래스가 생성될 때(클래스를 통해서 객체를 만들 때) 호출된다
        println(name)
        this.name = name
    }
}

// 클래스를 호출하는 방법 -> 클래스를 통해서 객체를 만드는 방법
// 클래스를 호출 -> 인스턴스화 (Instance)
// 객체 -> Object, Instance
val user = User1("이은재")

// 주생성자 -> 생략할 수 있는 모든걸 생략하는 방법
class User2(val name: String){

}

val user2 = User2("홍길동")
println(user2.name)


//부 생성자(Secondary Constructor)
// - constructor 키워드 생략할 수 없다
// - 주생성자에는 객체를 만들기위한 필수 조건이 있다면, 부생성자에는 객체를 만들기위한 추가 옵션조건이 있다.
// - 부생성자에는 주생성자에서 필요한 조건을 포함하고 있어야한다(파라미터를 포함하고 있어야함)
class User3 constructor(var name: String){
    var age: Int = 0
    var nickname: String = ""

    init{
        println("init....")
    }
    // 부생성자는 클래스명 우측에 올 수 없다. -> 클래스의 본문에 있어야 한다.
    constructor(name: String, age: Int): this(name){
        this.age = age
    }
    constructor(name: String, age: Int, nickname: String):this(name){
        this.age = age
        this.nickname = nickname
    }
}

val user4 = User3("가나다")
println(user4.name)

val user3 = User3("이은재",24)
println("이름 : ${user3.name}, 나이 : ${user3.age}")

val user5 = User3("이은재",24, "안드로이드마스터")
println("이름 : ${user5.name}, 나이 : ${user5.age}, 닉네임 : ${user5.nickname}")

// 실행순서
// 부생성자 호출 -> 부생성자 안에있는 주생성자 호출 -> init블록 호출 -> 부생성자 본문 실행
// 클래스 속성(프로퍼티)에서 초기화를 시켜주지 않아도 되는 이유
// - 초기화블록에서 초기화를 보장해주기 때문 -> 클래스가 생성될 때 초기화 블록은 무조건 실행 된다.
// - 초기화블록에 없는 속성은 선언할 때 초기화 해줘야 한다



class User7 {
    val age: Int
    val name: String

    constructor(age: Int, name: String){
        this.age = age
        this.name = name
    }

}

val user6 = User7(10, "가가가")
println(user6.age)
// 주 생성자가 없는것처럼 보이고 부 생성자만 있을 때 부 생성자가 주 생성자처럼 보인다.
// -> 부 생성자가 맞다!!
// -> 주 생성자는 코틀린이 자동으로 만들어 준다
// -> 주 생성자가 없기 때문에 this()생성자를 이용해 생성을 위임할 필요가 없다.








