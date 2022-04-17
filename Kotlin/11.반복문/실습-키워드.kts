//break
for(i in 1..3){
    for(j in 1..3){
        if(j == 2) break
        else println("j")
    }
}
//continue
for(i in 1..3){
    println("i : ${i}")
    for(j in 1..3){
        if(j==2) continue
        else println("j : ${j}")
    }
}

//return
fun returnFunction(){

    for(i in 1..3){
        println("i : ${i}")
        for(j in 1..3){
            if(j==2) return
            else println("j : ${j}")
        }
    }
}
println("----------------")
returnFunction()
println("----------------")
//label
loop@for(i in 1..3){
    println("i : ${i}")
    for(j in 1..3){
        if(j == 2) break@loop
        else println("j : ${j}")
    }
}
println("----------------")
loop@for(i in 1..3){
    println("i : ${i}")
    for(j in 1..3){
        if(j==2) continue@loop
        else println("j : ${j}")
    }
}
// foreach + label
// foreach는 continue와 break 사용 불가
println("foreach-----------")
listOf(1,2,3).forEach loop@{
    if(it==2) return@loop
    else println(it)
}

