// getter/ setter

class Book(){
    var title: String = "모름"
        get() {
            println("getter")
            return field
        }
        set(value){
            println("setter")
            field = value
        }
}

//val book = Book()
//println(book.title)
//book.title = "안드로이드 스튜디오"
//println(book.title)

//lateinit
class MasterBook(){
    lateinit var title: String

    fun nextPage(){
        if(::title.isInitialized) //런타임 때 title이라는 속성에 접근해서 초기화가 된 상태인지 확인
            println("다음 페이지")
        else
            println("초기화 필요")
    }
}
val book = MasterBook()
book.title = "안드로이드 스튜디오"
println(book.nextPage())
val book2 = MasterBook()
println(book2.nextPage())

// Lazy
// - 호출 시점에 by lazy 정의에 의해서 초기화 수행한다
// - val 에서만 사용이 가능
class Book2(){
    val title: String by lazy{
        //본문 -> 다른 작업도 할 수 있지만 반드시 프로퍼티를 초기화 시켜주는 작업을 해야한다.
        println("lazy 초기화") // 다른
//      title = "책 제목" (X)
//      return "책 제목" (X)
        "책 제목"
    }

}

val book3 = Book2()
println(book3.title)







